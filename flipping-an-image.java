class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int len = image.length;
        for(int i=0;i<len;i++)
        {
            int a=0;
            int b=len-1;
            while(a<=b)
            {
                int tmp = image[i][a];
                image[i][a] = image[i][b];
                image[i][b] = tmp;
                if(image[i][a]==0)
                    image[i][a]=1;
                else
                    image[i][a]=0;
                if(a!=b)
                {
                    if(image[i][b]==0)
                    image[i][b]=1;
                else
                    image[i][b]=0;
                }
                a++;
                b--;
            }
        }
        
        return image;
    }
}
