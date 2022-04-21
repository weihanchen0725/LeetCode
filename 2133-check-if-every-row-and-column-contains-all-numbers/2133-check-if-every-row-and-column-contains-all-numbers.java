class Solution {
    public boolean checkValid(int[][]arr) {
        int n=arr.length;
		for(int r=0;r<n;r++)
		{
			boolean[] row =new boolean[n+1];
			boolean[] col =new boolean[n+1];
			for(int c=0;c<n;c++)
			{
				int x=arr[r][c];
				int y=arr[c][r];
				
				if(row[x]==true||col[y]==true)
				{
					return false;
					//sbreak;
				}
				row[x]=true;
				col[y]=true;
			}
		}
		return true;
	}
}