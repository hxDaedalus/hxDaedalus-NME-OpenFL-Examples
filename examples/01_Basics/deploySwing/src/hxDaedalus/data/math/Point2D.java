package hxDaedalus.data.math;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Point2D extends haxe.lang.HxObject
{
	public    Point2D(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    Point2D(java.lang.Object x_, java.lang.Object y_)
	{
		hxDaedalus.data.math.Point2D.__hx_ctor_hxDaedalus_data_math_Point2D(this, x_, y_);
	}
	
	
	public static   void __hx_ctor_hxDaedalus_data_math_Point2D(hxDaedalus.data.math.Point2D __temp_me25, java.lang.Object x_, java.lang.Object y_)
	{
		double __temp_y_24 = ( (( y_ == null )) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(y_)) )) );
		double __temp_x_23 = ( (( x_ == null )) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(x_)) )) );
		__temp_me25.x = __temp_x_23;
		__temp_me25.y = __temp_y_24;
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new hxDaedalus.data.math.Point2D(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new hxDaedalus.data.math.Point2D(((java.lang.Object) (arr.__get(0)) ), ((java.lang.Object) (arr.__get(1)) ));
	}
	
	
	
	
	public  double x;
	
	public  double y;
	
	public   void transform(hxDaedalus.data.math.Matrix2D matrix)
	{
		matrix.tranform(this);
	}
	
	
	public   void setXY(double x_, double y_)
	{
		this.x = x_;
		this.y = y_;
	}
	
	
	public   hxDaedalus.data.math.Point2D clone()
	{
		double _0 = this.x;
		double _1 = this.y;
		hxDaedalus.data.math.Point2D _2 = new hxDaedalus.data.math.Point2D(((java.lang.Object) (_0) ), ((java.lang.Object) (_1) ));
		return _2;
	}
	
	
	public   void substract(hxDaedalus.data.math.Point2D p)
	{
		double _0 = p.x;
		this.x -= _0;
		double _1 = p.y;
		this.y -= _1;
	}
	
	
	public   double get_length()
	{
		double _0 = this.x;
		double _1 = this.x;
		double _2 = ( _0 * _1 );
		double _3 = this.y;
		double _4 = this.y;
		double _5 = ( _3 * _4 );
		double _6 = ( _2 + _5 );
		double _7 = java.lang.Math.sqrt(_6);
		return _7;
	}
	
	
	public   void normalize()
	{
		double _0 = this.get_length();
		double norm = _0;
		double _1 = this.x;
		double _2 = ( _1 / norm );
		this.x = _2;
		double _3 = this.y;
		double _4 = ( _3 / norm );
		this.y = _4;
	}
	
	
	public   void scale(double s)
	{
		double _0 = this.x;
		double _1 = ( _0 * s );
		this.x = _1;
		double _2 = this.y;
		double _3 = ( _2 * s );
		this.y = _3;
	}
	
	
	public   double distanceTo(hxDaedalus.data.math.Point2D p)
	{
		double _0 = this.x;
		double _1 = p.x;
		double _2 = ( _0 - _1 );
		double diffX = _2;
		double _3 = this.y;
		double _4 = p.y;
		double _5 = ( _3 - _4 );
		double diffY = _5;
		double _6 = ( diffX * diffX );
		double _7 = ( diffY * diffY );
		double _8 = ( _6 + _7 );
		double _9 = java.lang.Math.sqrt(_8);
		return _9;
	}
	
	
	@Override public   double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef137 = true;
			switch (field.hashCode())
			{
				case 121:
				{
					if (field.equals("y")) 
					{
						__temp_executeDef137 = false;
						this.y = ((double) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 120:
				{
					if (field.equals("x")) 
					{
						__temp_executeDef137 = false;
						this.x = ((double) (value) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef137) 
			{
				return super.__hx_setField_f(field, value, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef138 = true;
			switch (field.hashCode())
			{
				case 121:
				{
					if (field.equals("y")) 
					{
						__temp_executeDef138 = false;
						this.y = ((double) (haxe.lang.Runtime.toDouble(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 120:
				{
					if (field.equals("x")) 
					{
						__temp_executeDef138 = false;
						this.x = ((double) (haxe.lang.Runtime.toDouble(value)) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef138) 
			{
				return super.__hx_setField(field, value, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		{
			boolean __temp_executeDef139 = true;
			switch (field.hashCode())
			{
				case -1963037360:
				{
					if (field.equals("distanceTo")) 
					{
						__temp_executeDef139 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("distanceTo"))) );
					}
					
					break;
				}
				
				
				case -1106363674:
				{
					if (field.equals("length")) 
					{
						__temp_executeDef139 = false;
						return this.get_length();
					}
					
					break;
				}
				
				
				case 109250890:
				{
					if (field.equals("scale")) 
					{
						__temp_executeDef139 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("scale"))) );
					}
					
					break;
				}
				
				
				case 120:
				{
					if (field.equals("x")) 
					{
						__temp_executeDef139 = false;
						return this.x;
					}
					
					break;
				}
				
				
				case 236609293:
				{
					if (field.equals("normalize")) 
					{
						__temp_executeDef139 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("normalize"))) );
					}
					
					break;
				}
				
				
				case 121:
				{
					if (field.equals("y")) 
					{
						__temp_executeDef139 = false;
						return this.y;
					}
					
					break;
				}
				
				
				case 974314479:
				{
					if (field.equals("get_length")) 
					{
						__temp_executeDef139 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("get_length"))) );
					}
					
					break;
				}
				
				
				case 1052666732:
				{
					if (field.equals("transform")) 
					{
						__temp_executeDef139 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("transform"))) );
					}
					
					break;
				}
				
				
				case 530534145:
				{
					if (field.equals("substract")) 
					{
						__temp_executeDef139 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("substract"))) );
					}
					
					break;
				}
				
				
				case 109328099:
				{
					if (field.equals("setXY")) 
					{
						__temp_executeDef139 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("setXY"))) );
					}
					
					break;
				}
				
				
				case 94756189:
				{
					if (field.equals("clone")) 
					{
						__temp_executeDef139 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("clone"))) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef139) 
			{
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		{
			boolean __temp_executeDef140 = true;
			switch (field.hashCode())
			{
				case 121:
				{
					if (field.equals("y")) 
					{
						__temp_executeDef140 = false;
						return this.y;
					}
					
					break;
				}
				
				
				case -1106363674:
				{
					if (field.equals("length")) 
					{
						__temp_executeDef140 = false;
						return this.get_length();
					}
					
					break;
				}
				
				
				case 120:
				{
					if (field.equals("x")) 
					{
						__temp_executeDef140 = false;
						return this.x;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef140) 
			{
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		{
			boolean __temp_executeDef141 = true;
			switch (field.hashCode())
			{
				case -1963037360:
				{
					if (field.equals("distanceTo")) 
					{
						__temp_executeDef141 = false;
						return this.distanceTo(((hxDaedalus.data.math.Point2D) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case 1052666732:
				{
					if (field.equals("transform")) 
					{
						__temp_executeDef141 = false;
						this.transform(((hxDaedalus.data.math.Matrix2D) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case 109250890:
				{
					if (field.equals("scale")) 
					{
						__temp_executeDef141 = false;
						this.scale(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					break;
				}
				
				
				case 109328099:
				{
					if (field.equals("setXY")) 
					{
						__temp_executeDef141 = false;
						this.setXY(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(1))) ));
					}
					
					break;
				}
				
				
				case 236609293:
				{
					if (field.equals("normalize")) 
					{
						__temp_executeDef141 = false;
						this.normalize();
					}
					
					break;
				}
				
				
				case 94756189:
				{
					if (field.equals("clone")) 
					{
						__temp_executeDef141 = false;
						return this.clone();
					}
					
					break;
				}
				
				
				case 974314479:
				{
					if (field.equals("get_length")) 
					{
						__temp_executeDef141 = false;
						return this.get_length();
					}
					
					break;
				}
				
				
				case 530534145:
				{
					if (field.equals("substract")) 
					{
						__temp_executeDef141 = false;
						this.substract(((hxDaedalus.data.math.Point2D) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef141) 
			{
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		return null;
	}
	
	
	@Override public   void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("y");
		baseArr.push("x");
		baseArr.push("length");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


