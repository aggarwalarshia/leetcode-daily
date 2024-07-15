class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // created stack to keep track of moving asteroids
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<asteroids.length;i++)
        {
            // either stack is empty OR value of asteroid is +ve (moving to right)
            // add the values to the stack
            if(stack.isEmpty() || asteroids[i]>0)
            {
                stack.push(asteroids[i]);
            }
            // if value of current asteroid is -ve (moving to left)
            // pick the topmost element in stack without removing it using peek func
            else
            {
                while(true)
                {
                    int top = stack.peek();
                    // if topmost asteroid is -ve
                    // add it to stack
                    // and break the loop
                    if(top<0)
                    {
                        stack.push(asteroids[i]);
                        break;
                    }
                    // if absolute value of current asteroid and top element of stack are equal 
                    // then remove that element from stack
                    // and break loop
                    if(Math.abs(asteroids[i])==top)
                    {
                        stack.pop();
                        break;
                    }
                    // if abs value of current asteroid is less than top asteroid
                    // current asteroid is destroyed
                    // do nothing, simply break the loop
                    else if(Math.abs(asteroids[i]) < top)
                    {
                        break;
                    }
                    // if current asteroid is greater than top asteroid
                    // remove top asteroid from stack
                    else
                    {
                        stack.pop();
                        // if stack gets empty after removal of elements, and value of current asteroid
                        // and break loop
                        if(stack.isEmpty())
                        {
                            stack.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }

        // convert all remaining asteroids in stack into array
        // return result in form of array created
        int len=stack.size();
        int[] ans=new int[len];
        for(int i=len-1;i>=0;i--)
        {
            ans[i]=stack.pop();
        }
        return ans;
    }
}