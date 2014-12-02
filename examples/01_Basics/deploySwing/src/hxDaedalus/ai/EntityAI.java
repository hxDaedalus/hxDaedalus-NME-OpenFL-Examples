package hxDaedalus.ai;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class EntityAI extends haxe.lang.HxObject
{
	static 
	{
		hxDaedalus.ai.EntityAI.NUM_SEGMENTS = 6;
	}
	public    EntityAI(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    EntityAI()
	{
		hxDaedalus.ai.EntityAI.__hx_ctor_hxDaedalus_ai_EntityAI(this);
	}
	
	
	public static   void __hx_ctor_hxDaedalus_ai_EntityAI(hxDaedalus.ai.EntityAI __temp_me10)
	{
		__temp_me10._radius = ((double) (10) );
		double _0 = __temp_me10.y = ((double) (0) );
		__temp_me10.x = _0;
		__temp_me10.dirNormX = ((double) (1) );
		__temp_me10.dirNormY = ((double) (0) );
		__temp_me10.angleFOV = ((double) (60) );
	}
	
	
	public static  int NUM_SEGMENTS;
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new hxDaedalus.ai.EntityAI(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new hxDaedalus.ai.EntityAI();
	}
	
	
	
	
	public  double angleFOV;
	
	public  double dirNormY;
	
	public  double dirNormX;
	
	public  double y;
	
	public  double x;
	
	
	
	
	
	public  double _radius;
	
	public  double _radiusSquared;
	
	public  double _x;
	
	public  double _y;
	
	public  double _dirNormX;
	
	public  double _dirNormY;
	
	public  double _angleFOV;
	
	public  hxDaedalus.data.Object _approximateObject;
	
	public   void buildApproximation()
	{
		hxDaedalus.data.Object _0 = new hxDaedalus.data.Object();
		this._approximateObject = _0;
		double _1 = this.x;
		double _2 = this.y;
		this._approximateObject.get_matrix().translate(_1, _2);
		haxe.root.Array<java.lang.Object> _3 = new haxe.root.Array<java.lang.Object>();
		haxe.root.Array<java.lang.Object> coordinates = _3;
		haxe.root.Array<java.lang.Object> _4 = coordinates;
		this._approximateObject.set_coordinates(_4);
		double _5 = this._radius;
		boolean _6 = ( _5 == 0 );
		if (_6) 
		{
			return ;
		}
		
		{
			int _g = 0;
			while (true)
			{
				boolean _7 = ( _g < 6 );
				boolean _8 =  ! (_7) ;
				if (_8) 
				{
					break;
				}
				
				int _9 = _g++;
				int i = _9;
				double _10 = this._radius;
				double _11 = java.lang.Math.PI;
				double _12 = ( 2 * _11 );
				double _13 = ( _12 * i );
				double _14 = ( _13 / 6 );
				double _15 = java.lang.Math.cos(_14);
				double _16 = ( _10 * _15 );
				coordinates.push(_16);
				double _17 = this._radius;
				double _18 = java.lang.Math.PI;
				double _19 = ( 2 * _18 );
				double _20 = ( _19 * i );
				double _21 = ( _20 / 6 );
				double _22 = java.lang.Math.sin(_21);
				double _23 = ( _17 * _22 );
				coordinates.push(_23);
				double _24 = this._radius;
				double _25 = java.lang.Math.PI;
				double _26 = ( 2 * _25 );
				int _27 = ( i + 1 );
				double _28 = ( _26 * _27 );
				double _29 = ( _28 / 6 );
				double _30 = java.lang.Math.cos(_29);
				double _31 = ( _24 * _30 );
				coordinates.push(_31);
				double _32 = this._radius;
				double _33 = java.lang.Math.PI;
				double _34 = ( 2 * _33 );
				int _35 = ( i + 1 );
				double _36 = ( _34 * _35 );
				double _37 = ( _36 / 6 );
				double _38 = java.lang.Math.sin(_37);
				double _39 = ( _32 * _38 );
				coordinates.push(_39);
			}
			
		}
		
	}
	
	
	public   hxDaedalus.data.Object get_approximateObject()
	{
		this._approximateObject.get_matrix().identity();
		double _0 = this.x;
		double _1 = this.y;
		this._approximateObject.get_matrix().translate(_0, _1);
		hxDaedalus.data.Object _2 = this._approximateObject;
		return _2;
	}
	
	
	public   double get_radius()
	{
		double _0 = this._radius;
		return _0;
	}
	
	
	public   double get_radiusSquared()
	{
		double _0 = this._radiusSquared;
		return _0;
	}
	
	
	public   double set_radius(double value)
	{
		this._radius = value;
		double _0 = this._radius;
		double _1 = this._radius;
		double _2 = ( _0 * _1 );
		this._radiusSquared = _2;
		return value;
	}
	
	
	@Override public   double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef95 = true;
			switch (field.hashCode())
			{
				case -762792871:
				{
					if (field.equals("_angleFOV")) 
					{
						__temp_executeDef95 = false;
						this._angleFOV = ((double) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -853310726:
				{
					if (field.equals("angleFOV")) 
					{
						__temp_executeDef95 = false;
						this.angleFOV = ((double) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 315675887:
				{
					if (field.equals("_dirNormY")) 
					{
						__temp_executeDef95 = false;
						this._dirNormY = ((double) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 225158032:
				{
					if (field.equals("dirNormY")) 
					{
						__temp_executeDef95 = false;
						this.dirNormY = ((double) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 315675886:
				{
					if (field.equals("_dirNormX")) 
					{
						__temp_executeDef95 = false;
						this._dirNormX = ((double) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 225158031:
				{
					if (field.equals("dirNormX")) 
					{
						__temp_executeDef95 = false;
						this.dirNormX = ((double) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 3066:
				{
					if (field.equals("_y")) 
					{
						__temp_executeDef95 = false;
						this._y = ((double) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 121:
				{
					if (field.equals("y")) 
					{
						__temp_executeDef95 = false;
						this.y = ((double) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 3065:
				{
					if (field.equals("_x")) 
					{
						__temp_executeDef95 = false;
						this._x = ((double) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 120:
				{
					if (field.equals("x")) 
					{
						__temp_executeDef95 = false;
						this.x = ((double) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -1460609034:
				{
					if (field.equals("_radiusSquared")) 
					{
						__temp_executeDef95 = false;
						this._radiusSquared = ((double) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -938578798:
				{
					if (field.equals("radius")) 
					{
						__temp_executeDef95 = false;
						this.set_radius(value);
						return value;
					}
					
					break;
				}
				
				
				case 1769892273:
				{
					if (field.equals("_radius")) 
					{
						__temp_executeDef95 = false;
						this._radius = ((double) (value) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef95) 
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
			boolean __temp_executeDef96 = true;
			switch (field.hashCode())
			{
				case -580090636:
				{
					if (field.equals("_approximateObject")) 
					{
						__temp_executeDef96 = false;
						this._approximateObject = ((hxDaedalus.data.Object) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -853310726:
				{
					if (field.equals("angleFOV")) 
					{
						__temp_executeDef96 = false;
						this.angleFOV = ((double) (haxe.lang.Runtime.toDouble(value)) );
						return value;
					}
					
					break;
				}
				
				
				case -762792871:
				{
					if (field.equals("_angleFOV")) 
					{
						__temp_executeDef96 = false;
						this._angleFOV = ((double) (haxe.lang.Runtime.toDouble(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 225158032:
				{
					if (field.equals("dirNormY")) 
					{
						__temp_executeDef96 = false;
						this.dirNormY = ((double) (haxe.lang.Runtime.toDouble(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 315675887:
				{
					if (field.equals("_dirNormY")) 
					{
						__temp_executeDef96 = false;
						this._dirNormY = ((double) (haxe.lang.Runtime.toDouble(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 225158031:
				{
					if (field.equals("dirNormX")) 
					{
						__temp_executeDef96 = false;
						this.dirNormX = ((double) (haxe.lang.Runtime.toDouble(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 315675886:
				{
					if (field.equals("_dirNormX")) 
					{
						__temp_executeDef96 = false;
						this._dirNormX = ((double) (haxe.lang.Runtime.toDouble(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 121:
				{
					if (field.equals("y")) 
					{
						__temp_executeDef96 = false;
						this.y = ((double) (haxe.lang.Runtime.toDouble(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 3066:
				{
					if (field.equals("_y")) 
					{
						__temp_executeDef96 = false;
						this._y = ((double) (haxe.lang.Runtime.toDouble(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 120:
				{
					if (field.equals("x")) 
					{
						__temp_executeDef96 = false;
						this.x = ((double) (haxe.lang.Runtime.toDouble(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 3065:
				{
					if (field.equals("_x")) 
					{
						__temp_executeDef96 = false;
						this._x = ((double) (haxe.lang.Runtime.toDouble(value)) );
						return value;
					}
					
					break;
				}
				
				
				case -938578798:
				{
					if (field.equals("radius")) 
					{
						__temp_executeDef96 = false;
						this.set_radius(((double) (haxe.lang.Runtime.toDouble(value)) ));
						return value;
					}
					
					break;
				}
				
				
				case -1460609034:
				{
					if (field.equals("_radiusSquared")) 
					{
						__temp_executeDef96 = false;
						this._radiusSquared = ((double) (haxe.lang.Runtime.toDouble(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 1769892273:
				{
					if (field.equals("_radius")) 
					{
						__temp_executeDef96 = false;
						this._radius = ((double) (haxe.lang.Runtime.toDouble(value)) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef96) 
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
			boolean __temp_executeDef97 = true;
			switch (field.hashCode())
			{
				case -1216062705:
				{
					if (field.equals("set_radius")) 
					{
						__temp_executeDef97 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("set_radius"))) );
					}
					
					break;
				}
				
				
				case -347497613:
				{
					if (field.equals("approximateObject")) 
					{
						__temp_executeDef97 = false;
						return this.get_approximateObject();
					}
					
					break;
				}
				
				
				case -750657332:
				{
					if (field.equals("get_radiusSquared")) 
					{
						__temp_executeDef97 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("get_radiusSquared"))) );
					}
					
					break;
				}
				
				
				case -853310726:
				{
					if (field.equals("angleFOV")) 
					{
						__temp_executeDef97 = false;
						return this.angleFOV;
					}
					
					break;
				}
				
				
				case 1142099355:
				{
					if (field.equals("get_radius")) 
					{
						__temp_executeDef97 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("get_radius"))) );
					}
					
					break;
				}
				
				
				case 225158032:
				{
					if (field.equals("dirNormY")) 
					{
						__temp_executeDef97 = false;
						return this.dirNormY;
					}
					
					break;
				}
				
				
				case -2096813366:
				{
					if (field.equals("get_approximateObject")) 
					{
						__temp_executeDef97 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("get_approximateObject"))) );
					}
					
					break;
				}
				
				
				case 225158031:
				{
					if (field.equals("dirNormX")) 
					{
						__temp_executeDef97 = false;
						return this.dirNormX;
					}
					
					break;
				}
				
				
				case 209133353:
				{
					if (field.equals("buildApproximation")) 
					{
						__temp_executeDef97 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("buildApproximation"))) );
					}
					
					break;
				}
				
				
				case 121:
				{
					if (field.equals("y")) 
					{
						__temp_executeDef97 = false;
						return this.y;
					}
					
					break;
				}
				
				
				case -580090636:
				{
					if (field.equals("_approximateObject")) 
					{
						__temp_executeDef97 = false;
						return this._approximateObject;
					}
					
					break;
				}
				
				
				case 120:
				{
					if (field.equals("x")) 
					{
						__temp_executeDef97 = false;
						return this.x;
					}
					
					break;
				}
				
				
				case -762792871:
				{
					if (field.equals("_angleFOV")) 
					{
						__temp_executeDef97 = false;
						return this._angleFOV;
					}
					
					break;
				}
				
				
				case -938578798:
				{
					if (field.equals("radius")) 
					{
						__temp_executeDef97 = false;
						return this.get_radius();
					}
					
					break;
				}
				
				
				case 315675887:
				{
					if (field.equals("_dirNormY")) 
					{
						__temp_executeDef97 = false;
						return this._dirNormY;
					}
					
					break;
				}
				
				
				case -677179915:
				{
					if (field.equals("radiusSquared")) 
					{
						__temp_executeDef97 = false;
						return this.get_radiusSquared();
					}
					
					break;
				}
				
				
				case 315675886:
				{
					if (field.equals("_dirNormX")) 
					{
						__temp_executeDef97 = false;
						return this._dirNormX;
					}
					
					break;
				}
				
				
				case 1769892273:
				{
					if (field.equals("_radius")) 
					{
						__temp_executeDef97 = false;
						return this._radius;
					}
					
					break;
				}
				
				
				case 3066:
				{
					if (field.equals("_y")) 
					{
						__temp_executeDef97 = false;
						return this._y;
					}
					
					break;
				}
				
				
				case -1460609034:
				{
					if (field.equals("_radiusSquared")) 
					{
						__temp_executeDef97 = false;
						return this._radiusSquared;
					}
					
					break;
				}
				
				
				case 3065:
				{
					if (field.equals("_x")) 
					{
						__temp_executeDef97 = false;
						return this._x;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef97) 
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
			boolean __temp_executeDef98 = true;
			switch (field.hashCode())
			{
				case -762792871:
				{
					if (field.equals("_angleFOV")) 
					{
						__temp_executeDef98 = false;
						return this._angleFOV;
					}
					
					break;
				}
				
				
				case -853310726:
				{
					if (field.equals("angleFOV")) 
					{
						__temp_executeDef98 = false;
						return this.angleFOV;
					}
					
					break;
				}
				
				
				case 315675887:
				{
					if (field.equals("_dirNormY")) 
					{
						__temp_executeDef98 = false;
						return this._dirNormY;
					}
					
					break;
				}
				
				
				case 225158032:
				{
					if (field.equals("dirNormY")) 
					{
						__temp_executeDef98 = false;
						return this.dirNormY;
					}
					
					break;
				}
				
				
				case 315675886:
				{
					if (field.equals("_dirNormX")) 
					{
						__temp_executeDef98 = false;
						return this._dirNormX;
					}
					
					break;
				}
				
				
				case 225158031:
				{
					if (field.equals("dirNormX")) 
					{
						__temp_executeDef98 = false;
						return this.dirNormX;
					}
					
					break;
				}
				
				
				case 3066:
				{
					if (field.equals("_y")) 
					{
						__temp_executeDef98 = false;
						return this._y;
					}
					
					break;
				}
				
				
				case 121:
				{
					if (field.equals("y")) 
					{
						__temp_executeDef98 = false;
						return this.y;
					}
					
					break;
				}
				
				
				case 3065:
				{
					if (field.equals("_x")) 
					{
						__temp_executeDef98 = false;
						return this._x;
					}
					
					break;
				}
				
				
				case 120:
				{
					if (field.equals("x")) 
					{
						__temp_executeDef98 = false;
						return this.x;
					}
					
					break;
				}
				
				
				case -1460609034:
				{
					if (field.equals("_radiusSquared")) 
					{
						__temp_executeDef98 = false;
						return this._radiusSquared;
					}
					
					break;
				}
				
				
				case -938578798:
				{
					if (field.equals("radius")) 
					{
						__temp_executeDef98 = false;
						return this.get_radius();
					}
					
					break;
				}
				
				
				case 1769892273:
				{
					if (field.equals("_radius")) 
					{
						__temp_executeDef98 = false;
						return this._radius;
					}
					
					break;
				}
				
				
				case -677179915:
				{
					if (field.equals("radiusSquared")) 
					{
						__temp_executeDef98 = false;
						return this.get_radiusSquared();
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef98) 
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
			boolean __temp_executeDef99 = true;
			switch (field.hashCode())
			{
				case -1216062705:
				{
					if (field.equals("set_radius")) 
					{
						__temp_executeDef99 = false;
						return this.set_radius(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					break;
				}
				
				
				case 209133353:
				{
					if (field.equals("buildApproximation")) 
					{
						__temp_executeDef99 = false;
						this.buildApproximation();
					}
					
					break;
				}
				
				
				case -750657332:
				{
					if (field.equals("get_radiusSquared")) 
					{
						__temp_executeDef99 = false;
						return this.get_radiusSquared();
					}
					
					break;
				}
				
				
				case -2096813366:
				{
					if (field.equals("get_approximateObject")) 
					{
						__temp_executeDef99 = false;
						return this.get_approximateObject();
					}
					
					break;
				}
				
				
				case 1142099355:
				{
					if (field.equals("get_radius")) 
					{
						__temp_executeDef99 = false;
						return this.get_radius();
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef99) 
			{
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		return null;
	}
	
	
	@Override public   void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("_approximateObject");
		baseArr.push("_angleFOV");
		baseArr.push("_dirNormY");
		baseArr.push("_dirNormX");
		baseArr.push("_y");
		baseArr.push("_x");
		baseArr.push("_radiusSquared");
		baseArr.push("_radius");
		baseArr.push("radiusSquared");
		baseArr.push("radius");
		baseArr.push("x");
		baseArr.push("y");
		baseArr.push("dirNormX");
		baseArr.push("dirNormY");
		baseArr.push("angleFOV");
		baseArr.push("approximateObject");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


