package GraphicsObjects;



public class Vector3f {

	public float x=0;
	public float y=0;
	public float z=0;
	
	public Vector3f() 
	{  
		x = 0.0f;
		y = 0.0f;
		z = 0.0f;
	}
	 
	public Vector3f(float x, float y, float z) 
	{ 
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	 //implement Vector plus a Vector  and comment what the method does  
	public Vector3f PlusVector(Vector3f Additonal) 
	{
		Vector3f result = new Vector3f(x + Additonal.x, y + Additonal.y, z + Additonal.z);
		//The x, y, z coordinates of each vector plus the x, y, z in the input vector
		//The result is a vector
		return result;
	 
	} 
	
	 //implement Vector minus a Vector  and comment what the method does  
	public Vector3f MinusVector(Vector3f Minus) 
	{
		Vector3f result = new Vector3f(x - Minus.x, y - Minus.y, z - Minus.z);
		//The x, y, z coordinates of each vector minus the x, y, z in the input vector
		//The result is a vector
		return result;
	}
	
	//implement Vector plus a Point and comment what the method does  
	public Point3f PlusPoint(Point3f Additonal) 
	{
		Point3f result = new Point3f(x + Additonal.x, y + Additonal.y, z + Additonal.z);
		//The x, y, z coordinates of each vector plus the x, y, z in the input point
		//The result is a point
		return result;
	} 
	//Do not implement Vector minus a Point as it is undefined 
	
	//Implement a Vector * Scalar  and comment what the method does    ( we wont create Scalar * Vector due to expediency ) 
	public Vector3f byScalar(float scale )
	{
		Vector3f result = new Vector3f(x * scale, y * scale, z * scale);
		//Each coordinate of the vector is multiplied by the input scalar
		//The result is a vector
		return result;
	}
	
	//implement returning the negative of a Vector  and comment what the method does  
	public Vector3f  NegateVector()
	{
		Vector3f result = new Vector3f(-x, -y, -z);
		//Each coordinate of the vector becomes a negative
		return result;
	}
	
	//implement getting the length of a Vector    and comment what the method does
	public float length()
	{
		float result = (float) Math.sqrt(x*x + y*y + z*z);
		//The length of the vector is the sum of the squares of each coordinate and then squared
		return result;
	}
	
	//implement getting the Normal  of a Vector   and comment what the method does
	// Remember that since you just have one vector, this method is returning a normalized vector with a one unity length 
	public Vector3f Normal()
	{
		 float len = length();
		 Vector3f result = new Vector3f((float) (x/Math.sqrt(len)), (float) (y/Math.sqrt(len)), (float) (z/Math.sqrt(len)));
		 //The unit vector of a vector is each coordinate divided by the length of the vector
		 return result;
	} 
	
	//implement getting the dot product of Vector.Vector and comment what the method does 

	public float dot(Vector3f v)
	{
		float result = x*x + y*y + z*z;
		//The dot product of vectors is each coordinate squared and then added together
		return result;
	}
	
	//implement getting the cross product of Vector X Vector and comment what the method does  
	public Vector3f cross(Vector3f v)  
	{
		Vector3f result = new Vector3f(y*v.z - v.y*z, v.x*z -x*v.z , x*v.y - v.x*y);
		/** The formula for the cross product of vectors is
		 *
		 *  a * b = | i   j   k  | = (y1z2 - y2z1)i - (x1z2 - x2z1)j + (x1y2 - x2y1)k
		 * 		    | x1  y1  z1 |
		 * 		    | x2  y2  z2 |
		 */

		return result;
	}
 
}
	 
	   

/*

										MMMM                                        
										MMMMMM                                      
 										MM MMMM                                    
 										MMI  MMMM                                  
 										MMM    MMMM                                
 										MMM      MMMM                              
  										MM        MMMMM                           
  										MMM         MMMMM                         
  										MMM           OMMMM                       
   										MM             .MMMM                     
MMMMMMMMMMMMMMM                        MMM              .MMMM                   
MM   IMMMMMMMMMMMMMMMMMMMMMMMM         MMM                 MMMM                 
MM                  ~MMMMMMMMMMMMMMMMMMMMM                   MMMM               
MM                                  OMMMMM                     MMMMM            
MM                                                               MMMMM          
MM                                                                 MMMMM        
MM                                                                   ~MMMM      
MM                                                                     =MMMM    
MM                                                                        MMMM  
MM                                                                       MMMMMM 
MM                                                                     MMMMMMMM 
MM                                                                  :MMMMMMMM   
MM                                                                MMMMMMMMM     
MM                                                              MMMMMMMMM       
MM                             ,MMMMMMMMMM                    MMMMMMMMM         
MM              IMMMMMMMMMMMMMMMMMMMMMMMMM                  MMMMMMMM            
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM               ZMMMMMMMM              
MMMMMMMMMMMMMMMMMMMMMMMMMMMMM          MM$             MMMMMMMMM                
MMMMMMMMMMMMMM                       MMM            MMMMMMMMM                  
  									MMM          MMMMMMMM                     
  									MM~       IMMMMMMMM                       
  									MM      DMMMMMMMM                         
 								MMM    MMMMMMMMM                           
 								MMD  MMMMMMMM                              
								MMM MMMMMMMM                                
								MMMMMMMMMM                                  
								MMMMMMMM                                    
  								MMMM                                      
  								MM                                        
                             GlassGiant.com */