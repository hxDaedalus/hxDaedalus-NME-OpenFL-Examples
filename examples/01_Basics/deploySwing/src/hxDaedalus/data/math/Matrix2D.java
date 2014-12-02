package hxDaedalus.data.math;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Matrix2D extends haxe.lang.HxObject
{
	public    Matrix2D(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    Matrix2D(java.lang.Object a_, java.lang.Object b_, java.lang.Object c_, java.lang.Object d_, java.lang.Object e_, java.lang.Object f_)
	{
		hxDaedalus.data.math.Matrix2D.__hx_ctor_hxDaedalus_data_math_Matrix2D(this, a_, b_, c_, d_, e_, f_);
	}
	
	
	public static   void __hx_ctor_hxDaedalus_data_math_Matrix2D(hxDaedalus.data.math.Matrix2D __temp_me35, java.lang.Object a_, java.lang.Object b_, java.lang.Object c_, java.lang.Object d_, java.lang.Object e_, java.lang.Object f_)
	{
		double __temp_f_34 = ( (( f_ == null )) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(f_)) )) );
		double __temp_e_33 = ( (( e_ == null )) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(e_)) )) );
		double __temp_d_32 = ( (( d_ == null )) ? (((double) (1) )) : (((double) (haxe.lang.Runtime.toDouble(d_)) )) );
		double __temp_c_31 = ( (( c_ == null )) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(c_)) )) );
		double __temp_b_30 = ( (( b_ == null )) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(b_)) )) );
		double __temp_a_29 = ( (( a_ == null )) ? (((double) (1) )) : (((double) (haxe.lang.Runtime.toDouble(a_)) )) );
		__temp_me35.a = __temp_a_29;
		__temp_me35.b = __temp_b_30;
		__temp_me35.c = __temp_c_31;
		__temp_me35.d = __temp_d_32;
		__temp_me35.e = __temp_e_33;
		__temp_me35.f = __temp_f_34;
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new hxDaedalus.data.math.Matrix2D(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new hxDaedalus.data.math.Matrix2D(((java.lang.Object) (arr.__get(0)) ), ((java.lang.Object) (arr.__get(1)) ), ((java.lang.Object) (arr.__get(2)) ), ((java.lang.Object) (arr.__get(3)) ), ((java.lang.Object) (arr.__get(4)) ), ((java.lang.Object) (arr.__get(5)) ));
	}
	
	
	public  double a;
	
	public  double b;
	
	public  double c;
	
	public  double d;
	
	public  double e;
	
	public  double f;
	
	public   void identity()
	{
		this.a = ((double) (1) );
		this.b = ((double) (0) );
		this.c = ((double) (0) );
		this.d = ((double) (1) );
		this.e = ((double) (0) );
		this.f = ((double) (0) );
	}
	
	
	public   void translate(double tx, double ty)
	{
		double _0 = this.e;
		double _1 = ( _0 + tx );
		this.e = _1;
		double _2 = this.f;
		double _3 = ( _2 + ty );
		this.f = _3;
	}
	
	
	public   void scale(double sx, double sy)
	{
		double _0 = this.a;
		double _1 = ( _0 * sx );
		this.a = _1;
		double _2 = this.b;
		double _3 = ( _2 * sy );
		this.b = _3;
		double _4 = this.c;
		double _5 = ( _4 * sx );
		this.c = _5;
		double _6 = this.d;
		double _7 = ( _6 * sy );
		this.d = _7;
		double _8 = this.e;
		double _9 = ( _8 * sx );
		this.e = _9;
		double _10 = this.f;
		double _11 = ( _10 * sy );
		this.f = _11;
	}
	
	
	public   void rotate(double rad)
	{
		double _0 = java.lang.Math.cos(rad);
		double cos = _0;
		double _1 = java.lang.Math.sin(rad);
		double sin = _1;
		double _2 = this.a;
		double _3 = ( _2 * cos );
		double _4 = this.b;
		double _5 =  - (sin) ;
		double _6 = ( _4 * _5 );
		double _7 = ( _3 + _6 );
		double a_ = _7;
		double _8 = this.a;
		double _9 = ( _8 * sin );
		double _10 = this.b;
		double _11 = ( _10 * cos );
		double _12 = ( _9 + _11 );
		double b_ = _12;
		double _13 = this.c;
		double _14 = ( _13 * cos );
		double _15 = this.d;
		double _16 =  - (sin) ;
		double _17 = ( _15 * _16 );
		double _18 = ( _14 + _17 );
		double c_ = _18;
		double _19 = this.c;
		double _20 = ( _19 * sin );
		double _21 = this.d;
		double _22 = ( _21 * cos );
		double _23 = ( _20 + _22 );
		double d_ = _23;
		double _24 = this.e;
		double _25 = ( _24 * cos );
		double _26 = this.f;
		double _27 =  - (sin) ;
		double _28 = ( _26 * _27 );
		double _29 = ( _25 + _28 );
		double e_ = _29;
		double _30 = this.e;
		double _31 = ( _30 * sin );
		double _32 = this.f;
		double _33 = ( _32 * cos );
		double _34 = ( _31 + _33 );
		double f_ = _34;
		this.a = a_;
		this.b = b_;
		this.c = c_;
		this.d = d_;
		this.e = e_;
		this.f = f_;
	}
	
	
	public   hxDaedalus.data.math.Matrix2D clone()
	{
		double _0 = this.a;
		double _1 = this.b;
		double _2 = this.c;
		double _3 = this.d;
		double _4 = this.e;
		double _5 = this.f;
		hxDaedalus.data.math.Matrix2D _6 = new hxDaedalus.data.math.Matrix2D(((java.lang.Object) (_0) ), ((java.lang.Object) (_1) ), ((java.lang.Object) (_2) ), ((java.lang.Object) (_3) ), ((java.lang.Object) (_4) ), ((java.lang.Object) (_5) ));
		return _6;
	}
	
	
	public   void tranform(hxDaedalus.data.math.Point2D point)
	{
		double _0 = this.a;
		double _1 = point.x;
		double _2 = ( _0 * _1 );
		double _3 = this.c;
		double _4 = point.y;
		double _5 = ( _3 * _4 );
		double _6 = ( _2 + _5 );
		double _7 = this.e;
		double _8 = ( _6 + _7 );
		double x = _8;
		double _9 = this.b;
		double _10 = point.x;
		double _11 = ( _9 * _10 );
		double _12 = this.d;
		double _13 = point.y;
		double _14 = ( _12 * _13 );
		double _15 = ( _11 + _14 );
		double _16 = this.f;
		double _17 = ( _15 + _16 );
		double y = _17;
		point.x = x;
		point.y = y;
	}
	
	
	public   double transformX(double x, double y)
	{
		double _0 = this.a;
		double _1 = ( _0 * x );
		double _2 = this.c;
		double _3 = ( _2 * y );
		double _4 = ( _1 + _3 );
		double _5 = this.e;
		double _6 = ( _4 + _5 );
		return _6;
	}
	
	
	public   double transformY(double x, double y)
	{
		double _0 = this.b;
		double _1 = ( _0 * x );
		double _2 = this.d;
		double _3 = ( _2 * y );
		double _4 = ( _1 + _3 );
		double _5 = this.f;
		double _6 = ( _4 + _5 );
		return _6;
	}
	
	
	public   void concat(hxDaedalus.data.math.Matrix2D matrix)
	{
		double _0 = this.a;
		double _1 = matrix.a;
		double _2 = ( _0 * _1 );
		double _3 = this.b;
		double _4 = matrix.c;
		double _5 = ( _3 * _4 );
		double _6 = ( _2 + _5 );
		double a_ = _6;
		double _7 = this.a;
		double _8 = matrix.b;
		double _9 = ( _7 * _8 );
		double _10 = this.b;
		double _11 = matrix.d;
		double _12 = ( _10 * _11 );
		double _13 = ( _9 + _12 );
		double b_ = _13;
		double _14 = this.c;
		double _15 = matrix.a;
		double _16 = ( _14 * _15 );
		double _17 = this.d;
		double _18 = matrix.c;
		double _19 = ( _17 * _18 );
		double _20 = ( _16 + _19 );
		double c_ = _20;
		double _21 = this.c;
		double _22 = matrix.b;
		double _23 = ( _21 * _22 );
		double _24 = this.d;
		double _25 = matrix.d;
		double _26 = ( _24 * _25 );
		double _27 = ( _23 + _26 );
		double d_ = _27;
		double _28 = this.e;
		double _29 = matrix.a;
		double _30 = ( _28 * _29 );
		double _31 = this.f;
		double _32 = matrix.c;
		double _33 = ( _31 * _32 );
		double _34 = ( _30 + _33 );
		double _35 = matrix.e;
		double _36 = ( _34 + _35 );
		double e_ = _36;
		double _37 = this.e;
		double _38 = matrix.b;
		double _39 = ( _37 * _38 );
		double _40 = this.f;
		double _41 = matrix.d;
		double _42 = ( _40 * _41 );
		double _43 = ( _39 + _42 );
		double _44 = matrix.f;
		double _45 = ( _43 + _44 );
		double f_ = _45;
		this.a = a_;
		this.b = b_;
		this.c = c_;
		this.d = d_;
		this.e = e_;
		this.f = f_;
	}
	
	
	@Override public   double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef143 = true;
			switch (field.hashCode())
			{
				case 102:
				{
					if (field.equals("f")) 
					{
						__temp_executeDef143 = false;
						this.f = ((double) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 97:
				{
					if (field.equals("a")) 
					{
						__temp_executeDef143 = false;
						this.a = ((double) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 101:
				{
					if (field.equals("e")) 
					{
						__temp_executeDef143 = false;
						this.e = ((double) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 98:
				{
					if (field.equals("b")) 
					{
						__temp_executeDef143 = false;
						this.b = ((double) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 100:
				{
					if (field.equals("d")) 
					{
						__temp_executeDef143 = false;
						this.d = ((double) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 99:
				{
					if (field.equals("c")) 
					{
						__temp_executeDef143 = false;
						this.c = ((double) (value) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef143) 
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
			boolean __temp_executeDef144 = true;
			switch (field.hashCode())
			{
				case 102:
				{
					if (field.equals("f")) 
					{
						__temp_executeDef144 = false;
						this.f = ((double) (haxe.lang.Runtime.toDouble(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 97:
				{
					if (field.equals("a")) 
					{
						__temp_executeDef144 = false;
						this.a = ((double) (haxe.lang.Runtime.toDouble(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 101:
				{
					if (field.equals("e")) 
					{
						__temp_executeDef144 = false;
						this.e = ((double) (haxe.lang.Runtime.toDouble(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 98:
				{
					if (field.equals("b")) 
					{
						__temp_executeDef144 = false;
						this.b = ((double) (haxe.lang.Runtime.toDouble(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 100:
				{
					if (field.equals("d")) 
					{
						__temp_executeDef144 = false;
						this.d = ((double) (haxe.lang.Runtime.toDouble(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 99:
				{
					if (field.equals("c")) 
					{
						__temp_executeDef144 = false;
						this.c = ((double) (haxe.lang.Runtime.toDouble(value)) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef144) 
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
			boolean __temp_executeDef145 = true;
			switch (field.hashCode())
			{
				case -1354795244:
				{
					if (field.equals("concat")) 
					{
						__temp_executeDef145 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("concat"))) );
					}
					
					break;
				}
				
				
				case 97:
				{
					if (field.equals("a")) 
					{
						__temp_executeDef145 = false;
						return this.a;
					}
					
					break;
				}
				
				
				case -1727069587:
				{
					if (field.equals("transformY")) 
					{
						__temp_executeDef145 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("transformY"))) );
					}
					
					break;
				}
				
				
				case 98:
				{
					if (field.equals("b")) 
					{
						__temp_executeDef145 = false;
						return this.b;
					}
					
					break;
				}
				
				
				case -1727069588:
				{
					if (field.equals("transformX")) 
					{
						__temp_executeDef145 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("transformX"))) );
					}
					
					break;
				}
				
				
				case 99:
				{
					if (field.equals("c")) 
					{
						__temp_executeDef145 = false;
						return this.c;
					}
					
					break;
				}
				
				
				case 1280504431:
				{
					if (field.equals("tranform")) 
					{
						__temp_executeDef145 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("tranform"))) );
					}
					
					break;
				}
				
				
				case 100:
				{
					if (field.equals("d")) 
					{
						__temp_executeDef145 = false;
						return this.d;
					}
					
					break;
				}
				
				
				case 94756189:
				{
					if (field.equals("clone")) 
					{
						__temp_executeDef145 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("clone"))) );
					}
					
					break;
				}
				
				
				case 101:
				{
					if (field.equals("e")) 
					{
						__temp_executeDef145 = false;
						return this.e;
					}
					
					break;
				}
				
				
				case -925180581:
				{
					if (field.equals("rotate")) 
					{
						__temp_executeDef145 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("rotate"))) );
					}
					
					break;
				}
				
				
				case 102:
				{
					if (field.equals("f")) 
					{
						__temp_executeDef145 = false;
						return this.f;
					}
					
					break;
				}
				
				
				case 109250890:
				{
					if (field.equals("scale")) 
					{
						__temp_executeDef145 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("scale"))) );
					}
					
					break;
				}
				
				
				case -135761730:
				{
					if (field.equals("identity")) 
					{
						__temp_executeDef145 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("identity"))) );
					}
					
					break;
				}
				
				
				case 1052832078:
				{
					if (field.equals("translate")) 
					{
						__temp_executeDef145 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("translate"))) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef145) 
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
			boolean __temp_executeDef146 = true;
			switch (field.hashCode())
			{
				case 102:
				{
					if (field.equals("f")) 
					{
						__temp_executeDef146 = false;
						return this.f;
					}
					
					break;
				}
				
				
				case 97:
				{
					if (field.equals("a")) 
					{
						__temp_executeDef146 = false;
						return this.a;
					}
					
					break;
				}
				
				
				case 101:
				{
					if (field.equals("e")) 
					{
						__temp_executeDef146 = false;
						return this.e;
					}
					
					break;
				}
				
				
				case 98:
				{
					if (field.equals("b")) 
					{
						__temp_executeDef146 = false;
						return this.b;
					}
					
					break;
				}
				
				
				case 100:
				{
					if (field.equals("d")) 
					{
						__temp_executeDef146 = false;
						return this.d;
					}
					
					break;
				}
				
				
				case 99:
				{
					if (field.equals("c")) 
					{
						__temp_executeDef146 = false;
						return this.c;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef146) 
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
			boolean __temp_executeDef147 = true;
			switch (field.hashCode())
			{
				case -1354795244:
				{
					if (field.equals("concat")) 
					{
						__temp_executeDef147 = false;
						this.concat(((hxDaedalus.data.math.Matrix2D) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case -135761730:
				{
					if (field.equals("identity")) 
					{
						__temp_executeDef147 = false;
						this.identity();
					}
					
					break;
				}
				
				
				case -1727069587:
				{
					if (field.equals("transformY")) 
					{
						__temp_executeDef147 = false;
						return this.transformY(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(1))) ));
					}
					
					break;
				}
				
				
				case 1052832078:
				{
					if (field.equals("translate")) 
					{
						__temp_executeDef147 = false;
						this.translate(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(1))) ));
					}
					
					break;
				}
				
				
				case -1727069588:
				{
					if (field.equals("transformX")) 
					{
						__temp_executeDef147 = false;
						return this.transformX(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(1))) ));
					}
					
					break;
				}
				
				
				case 109250890:
				{
					if (field.equals("scale")) 
					{
						__temp_executeDef147 = false;
						this.scale(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(1))) ));
					}
					
					break;
				}
				
				
				case 1280504431:
				{
					if (field.equals("tranform")) 
					{
						__temp_executeDef147 = false;
						this.tranform(((hxDaedalus.data.math.Point2D) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case -925180581:
				{
					if (field.equals("rotate")) 
					{
						__temp_executeDef147 = false;
						this.rotate(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					break;
				}
				
				
				case 94756189:
				{
					if (field.equals("clone")) 
					{
						__temp_executeDef147 = false;
						return this.clone();
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef147) 
			{
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		return null;
	}
	
	
	@Override public   void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("f");
		baseArr.push("e");
		baseArr.push("d");
		baseArr.push("c");
		baseArr.push("b");
		baseArr.push("a");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


