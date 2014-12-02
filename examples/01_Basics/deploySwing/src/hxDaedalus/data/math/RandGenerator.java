package hxDaedalus.data.math;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class RandGenerator extends haxe.lang.HxObject
{
	public    RandGenerator(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    RandGenerator(java.lang.Object seed, java.lang.Object rangeMin_, java.lang.Object rangeMax_)
	{
		hxDaedalus.data.math.RandGenerator.__hx_ctor_hxDaedalus_data_math_RandGenerator(this, seed, rangeMin_, rangeMax_);
	}
	
	
	public static   void __hx_ctor_hxDaedalus_data_math_RandGenerator(hxDaedalus.data.math.RandGenerator __temp_me39, java.lang.Object seed, java.lang.Object rangeMin_, java.lang.Object rangeMax_)
	{
		int __temp_rangeMax_38 = ( (( rangeMax_ == null )) ? (((int) (1) )) : (((int) (haxe.lang.Runtime.toInt(rangeMax_)) )) );
		int __temp_rangeMin_37 = ( (( rangeMin_ == null )) ? (((int) (0) )) : (((int) (haxe.lang.Runtime.toInt(rangeMin_)) )) );
		int __temp_seed36 = ( (( seed == null )) ? (((int) (1234) )) : (((int) (haxe.lang.Runtime.toInt(seed)) )) );
		int _0 = __temp_me39._currSeed = __temp_seed36;
		__temp_me39._originalSeed = _0;
		__temp_me39.rangeMin = __temp_rangeMin_37;
		__temp_me39.rangeMax = __temp_rangeMax_38;
		__temp_me39._numIter = 0;
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new hxDaedalus.data.math.RandGenerator(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new hxDaedalus.data.math.RandGenerator(((java.lang.Object) (arr.__get(0)) ), ((java.lang.Object) (arr.__get(1)) ), ((java.lang.Object) (arr.__get(2)) ));
	}
	
	
	
	
	public  int rangeMin;
	
	public  int rangeMax;
	
	public  int _originalSeed;
	
	public  int _currSeed;
	
	public  int _rangeMin;
	
	public  int _rangeMax;
	
	public  int _numIter;
	
	public  java.lang.String _tempString;
	
	public   int set_seed(int value)
	{
		int _0 = this._currSeed = value;
		this._originalSeed = _0;
		return value;
	}
	
	
	public   int get_seed()
	{
		int _0 = this._originalSeed;
		return _0;
	}
	
	
	public   void reset()
	{
		int _0 = this._originalSeed;
		this._currSeed = _0;
		this._numIter = 0;
	}
	
	
	public   int next()
	{
		int _0 = this._currSeed;
		double _1 = ( _0 * 1.0 );
		double _floatSeed = _1;
		double _2 = ( _floatSeed * _floatSeed );
		java.lang.String _3 = haxe.root.Std.string(_2);
		this._tempString = _3;
		while (true)
		{
			int _4 = this._tempString.length();
			boolean _5 = ( _4 < 8 );
			boolean _6 =  ! (_5) ;
			if (_6) 
			{
				break;
			}
			
			java.lang.String _7 = this._tempString;
			java.lang.String _8 = ( "0" + _7 );
			this._tempString = _8;
		}
		
		java.lang.String _9 = haxe.lang.StringExt.substr(this._tempString, 1, 5);
		java.lang.Object _10 = haxe.root.Std.parseInt(_9);
		this._currSeed = ((int) (haxe.lang.Runtime.toInt(_10)) );
		int _11 = this.rangeMin;
		int _12 = this._currSeed;
		double _13 = ( ((double) (_12) ) / 99999 );
		int _14 = this.rangeMax;
		int _15 = this.rangeMin;
		int _16 = ( _14 - _15 );
		double _17 = ( _13 * _16 );
		double _18 = ( _11 + _17 );
		int _19 = ((int) (java.lang.Math.round(_18)) );
		int res = _19;
		int _20 = this._currSeed;
		boolean _21 = ( _20 == 0 );
		if (_21) 
		{
			int _22 = this._originalSeed;
			int _23 = this._numIter;
			int _24 = ( _22 + _23 );
			this._currSeed = _24;
		}
		
		this._numIter++;
		int _25 = this._numIter;
		boolean _26 = ( _25 == 200 );
		if (_26) 
		{
			this.reset();
		}
		
		return res;
	}
	
	
	@Override public   double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef148 = true;
			switch (field.hashCode())
			{
				case 356978303:
				{
					if (field.equals("_numIter")) 
					{
						__temp_executeDef148 = false;
						this._numIter = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 3526257:
				{
					if (field.equals("seed")) 
					{
						__temp_executeDef148 = false;
						this.set_seed(((int) (value) ));
						return value;
					}
					
					break;
				}
				
				
				case 343359558:
				{
					if (field.equals("_rangeMax")) 
					{
						__temp_executeDef148 = false;
						this._rangeMax = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 252841941:
				{
					if (field.equals("rangeMin")) 
					{
						__temp_executeDef148 = false;
						this.rangeMin = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 343359796:
				{
					if (field.equals("_rangeMin")) 
					{
						__temp_executeDef148 = false;
						this._rangeMin = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 252841703:
				{
					if (field.equals("rangeMax")) 
					{
						__temp_executeDef148 = false;
						this.rangeMax = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 665375010:
				{
					if (field.equals("_currSeed")) 
					{
						__temp_executeDef148 = false;
						this._currSeed = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 34465217:
				{
					if (field.equals("_originalSeed")) 
					{
						__temp_executeDef148 = false;
						this._originalSeed = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef148) 
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
			boolean __temp_executeDef149 = true;
			switch (field.hashCode())
			{
				case 1694086820:
				{
					if (field.equals("_tempString")) 
					{
						__temp_executeDef149 = false;
						this._tempString = haxe.lang.Runtime.toString(value);
						return value;
					}
					
					break;
				}
				
				
				case 3526257:
				{
					if (field.equals("seed")) 
					{
						__temp_executeDef149 = false;
						this.set_seed(((int) (haxe.lang.Runtime.toInt(value)) ));
						return value;
					}
					
					break;
				}
				
				
				case 356978303:
				{
					if (field.equals("_numIter")) 
					{
						__temp_executeDef149 = false;
						this._numIter = ((int) (haxe.lang.Runtime.toInt(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 252841941:
				{
					if (field.equals("rangeMin")) 
					{
						__temp_executeDef149 = false;
						this.rangeMin = ((int) (haxe.lang.Runtime.toInt(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 343359558:
				{
					if (field.equals("_rangeMax")) 
					{
						__temp_executeDef149 = false;
						this._rangeMax = ((int) (haxe.lang.Runtime.toInt(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 252841703:
				{
					if (field.equals("rangeMax")) 
					{
						__temp_executeDef149 = false;
						this.rangeMax = ((int) (haxe.lang.Runtime.toInt(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 343359796:
				{
					if (field.equals("_rangeMin")) 
					{
						__temp_executeDef149 = false;
						this._rangeMin = ((int) (haxe.lang.Runtime.toInt(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 34465217:
				{
					if (field.equals("_originalSeed")) 
					{
						__temp_executeDef149 = false;
						this._originalSeed = ((int) (haxe.lang.Runtime.toInt(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 665375010:
				{
					if (field.equals("_currSeed")) 
					{
						__temp_executeDef149 = false;
						this._currSeed = ((int) (haxe.lang.Runtime.toInt(value)) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef149) 
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
			boolean __temp_executeDef150 = true;
			switch (field.hashCode())
			{
				case 3377907:
				{
					if (field.equals("next")) 
					{
						__temp_executeDef150 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("next"))) );
					}
					
					break;
				}
				
				
				case 3526257:
				{
					if (field.equals("seed")) 
					{
						__temp_executeDef150 = false;
						return this.get_seed();
					}
					
					break;
				}
				
				
				case 108404047:
				{
					if (field.equals("reset")) 
					{
						__temp_executeDef150 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("reset"))) );
					}
					
					break;
				}
				
				
				case 252841941:
				{
					if (field.equals("rangeMin")) 
					{
						__temp_executeDef150 = false;
						return this.rangeMin;
					}
					
					break;
				}
				
				
				case 1976638906:
				{
					if (field.equals("get_seed")) 
					{
						__temp_executeDef150 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("get_seed"))) );
					}
					
					break;
				}
				
				
				case 252841703:
				{
					if (field.equals("rangeMax")) 
					{
						__temp_executeDef150 = false;
						return this.rangeMax;
					}
					
					break;
				}
				
				
				case 1415526446:
				{
					if (field.equals("set_seed")) 
					{
						__temp_executeDef150 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("set_seed"))) );
					}
					
					break;
				}
				
				
				case 34465217:
				{
					if (field.equals("_originalSeed")) 
					{
						__temp_executeDef150 = false;
						return this._originalSeed;
					}
					
					break;
				}
				
				
				case 1694086820:
				{
					if (field.equals("_tempString")) 
					{
						__temp_executeDef150 = false;
						return this._tempString;
					}
					
					break;
				}
				
				
				case 665375010:
				{
					if (field.equals("_currSeed")) 
					{
						__temp_executeDef150 = false;
						return this._currSeed;
					}
					
					break;
				}
				
				
				case 356978303:
				{
					if (field.equals("_numIter")) 
					{
						__temp_executeDef150 = false;
						return this._numIter;
					}
					
					break;
				}
				
				
				case 343359796:
				{
					if (field.equals("_rangeMin")) 
					{
						__temp_executeDef150 = false;
						return this._rangeMin;
					}
					
					break;
				}
				
				
				case 343359558:
				{
					if (field.equals("_rangeMax")) 
					{
						__temp_executeDef150 = false;
						return this._rangeMax;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef150) 
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
			boolean __temp_executeDef151 = true;
			switch (field.hashCode())
			{
				case 356978303:
				{
					if (field.equals("_numIter")) 
					{
						__temp_executeDef151 = false;
						return ((double) (this._numIter) );
					}
					
					break;
				}
				
				
				case 3526257:
				{
					if (field.equals("seed")) 
					{
						__temp_executeDef151 = false;
						return ((double) (this.get_seed()) );
					}
					
					break;
				}
				
				
				case 343359558:
				{
					if (field.equals("_rangeMax")) 
					{
						__temp_executeDef151 = false;
						return ((double) (this._rangeMax) );
					}
					
					break;
				}
				
				
				case 252841941:
				{
					if (field.equals("rangeMin")) 
					{
						__temp_executeDef151 = false;
						return ((double) (this.rangeMin) );
					}
					
					break;
				}
				
				
				case 343359796:
				{
					if (field.equals("_rangeMin")) 
					{
						__temp_executeDef151 = false;
						return ((double) (this._rangeMin) );
					}
					
					break;
				}
				
				
				case 252841703:
				{
					if (field.equals("rangeMax")) 
					{
						__temp_executeDef151 = false;
						return ((double) (this.rangeMax) );
					}
					
					break;
				}
				
				
				case 665375010:
				{
					if (field.equals("_currSeed")) 
					{
						__temp_executeDef151 = false;
						return ((double) (this._currSeed) );
					}
					
					break;
				}
				
				
				case 34465217:
				{
					if (field.equals("_originalSeed")) 
					{
						__temp_executeDef151 = false;
						return ((double) (this._originalSeed) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef151) 
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
			boolean __temp_executeDef152 = true;
			switch (field.hashCode())
			{
				case 3377907:
				{
					if (field.equals("next")) 
					{
						__temp_executeDef152 = false;
						return this.next();
					}
					
					break;
				}
				
				
				case 1415526446:
				{
					if (field.equals("set_seed")) 
					{
						__temp_executeDef152 = false;
						return this.set_seed(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					break;
				}
				
				
				case 108404047:
				{
					if (field.equals("reset")) 
					{
						__temp_executeDef152 = false;
						this.reset();
					}
					
					break;
				}
				
				
				case 1976638906:
				{
					if (field.equals("get_seed")) 
					{
						__temp_executeDef152 = false;
						return this.get_seed();
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef152) 
			{
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		return null;
	}
	
	
	@Override public   void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("_tempString");
		baseArr.push("_numIter");
		baseArr.push("_rangeMax");
		baseArr.push("_rangeMin");
		baseArr.push("_currSeed");
		baseArr.push("_originalSeed");
		baseArr.push("rangeMax");
		baseArr.push("rangeMin");
		baseArr.push("seed");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


