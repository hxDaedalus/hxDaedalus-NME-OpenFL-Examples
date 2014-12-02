package haxe.ds;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class ObjectMap<K, V> extends haxe.lang.HxObject implements haxe.root.IMap<K, V>
{
	public    ObjectMap(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    ObjectMap()
	{
		haxe.ds.ObjectMap.__hx_ctor_haxe_ds_ObjectMap(this);
	}
	
	
	public static  <K_c, V_c> void __hx_ctor_haxe_ds_ObjectMap(haxe.ds.ObjectMap<K_c, V_c> __temp_me8)
	{
		__temp_me8.cachedIndex = -1;
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.ds.ObjectMap<java.lang.Object, java.lang.Object>(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.ds.ObjectMap<java.lang.Object, java.lang.Object>();
	}
	
	
	public  int[] hashes;
	
	public  K[] _keys;
	
	public  V[] vals;
	
	public  int nBuckets;
	
	public  int size;
	
	public  int nOccupied;
	
	public  int upperBound;
	
	public  K cachedKey;
	
	public  int cachedIndex;
	
	public   void set(K key, V value)
	{
		int x = 0;
		int k = 0;
		int _0 = this.nOccupied;
		int _1 = this.upperBound;
		boolean _2 = ( _0 >= _1 );
		if (_2) 
		{
			int _3 = this.nBuckets;
			int _4 = this.size;
			int _5 = ( _4 << 1 );
			boolean _6 = ( _3 > _5 );
			if (_6) 
			{
				int _7 = this.nBuckets;
				int _8 = ( _7 - 1 );
				this.resize(_8);
			}
			 else 
			{
				int _9 = this.nBuckets;
				int _10 = ( _9 + 2 );
				this.resize(_10);
			}
			
		}
		
		int[] _11 = this.hashes;
		int[] hashes = _11;
		K[] _12 = this._keys;
		K[] keys = _12;
		int[] hashes1 = hashes;
		{
			int _13 = this.nBuckets;
			boolean _14 = ( _13 == 0 );
			int _16 = 0;
			if (_14) 
			{
				_16 = 0;
			}
			 else 
			{
				int _15 = this.nBuckets;
				_16 = ( _15 - 1 );
			}
			
			int mask = _16;
			int _17 = this.nBuckets;
			x = _17;
			int _18 = x;
			int site = _18;
			int _41 = 0;
			{
				int _19 = key.hashCode();
				int k1 = _19;
				int _20 = ( k1 + 2127912214 );
				int _21 = ( k1 << 12 );
				int _22 = ( _20 + _21 );
				k1 = _22;
				int _23 = ( k1 ^ -949894596 );
				int _24 = ( k1 >> 19 );
				int _25 = ( _23 ^ _24 );
				k1 = _25;
				int _26 = ( k1 + 374761393 );
				int _27 = ( k1 << 5 );
				int _28 = ( _26 + _27 );
				k1 = _28;
				int _29 = ( k1 + -744332180 );
				int _30 = ( k1 << 9 );
				int _31 = ( _29 ^ _30 );
				k1 = _31;
				int _32 = ( k1 + -42973499 );
				int _33 = ( k1 << 3 );
				int _34 = ( _32 + _33 );
				k1 = _34;
				int _35 = ( k1 ^ -1252372727 );
				int _36 = ( k1 >> 16 );
				int _37 = ( _35 ^ _36 );
				k1 = _37;
				int ret = k1;
				int _38 = ( ret & -2 );
				boolean _39 = ( _38 == 0 );
				if (_39) 
				{
					boolean _40 = ( ret == 0 );
					if (_40) 
					{
						ret = 2;
					}
					 else 
					{
						ret = -1;
					}
					
				}
				
				_41 = ret;
			}
			
			k = _41;
			int _42 = ( k & mask );
			int i = _42;
			int nProbes = 0;
			int _43 = hashes1[i];
			int _44 = ( _43 & -2 );
			boolean _45 = ( _44 == 0 );
			if (_45) 
			{
				x = i;
			}
			 else 
			{
				int last = i;
				int flag = 0;
				while (true)
				{
					boolean _52 = false;
					{
						int _50 = hashes1[i];
						int _46 = _50;
						flag = _46;
						int _47 = flag;
						int v = _47;
						int _51 = ( v & -2 );
						int _48 = _51;
						_52 = ( _48 == 0 );
					}
					
					boolean _53 =  ! (_52) ;
					boolean _55 = false;
					if (_53) 
					{
						boolean _54 = ( flag == k );
						boolean _49 = _54;
						if (_49) 
						{
							_55 = keys[i].equals(key);
						}
						 else 
						{
							_55 = false;
						}
						
					}
					 else 
					{
						_55 = true;
					}
					
					boolean _56 =  ! (_55) ;
					boolean _57 =  ! (_56) ;
					if (_57) 
					{
						break;
					}
					
					int _58 =  ++ nProbes;
					int _59 = ( i + _58 );
					int _60 = ( _59 & mask );
					i = _60;
				}
				
				x = i;
			}
			
		}
		
		int _61 = hashes1[x];
		int flag1 = _61;
		boolean _62 = ( flag1 == 0 );
		if (_62) 
		{
			keys[x] = key;
			V[] _63 = this.vals;
			_63[x] = value;
			hashes1[x] = k;
			this.size++;
			this.nOccupied++;
		}
		 else 
		{
			boolean _64 = ( flag1 == 1 );
			if (_64) 
			{
				keys[x] = key;
				V[] _65 = this.vals;
				_65[x] = value;
				hashes1[x] = k;
				this.size++;
			}
			 else 
			{
				V[] _66 = this.vals;
				_66[x] = value;
			}
			
		}
		
		this.cachedIndex = x;
		this.cachedKey = key;
	}
	
	
	public   int lookup(K key)
	{
		int _0 = this.nBuckets;
		boolean _1 = ( _0 != 0 );
		if (_1) 
		{
			int[] _2 = this.hashes;
			int[] hashes = _2;
			K[] _3 = this._keys;
			K[] keys = _3;
			int _4 = this.nBuckets;
			int _5 = ( _4 - 1 );
			int mask = _5;
			int _28 = 0;
			{
				int _6 = key.hashCode();
				int k = _6;
				int _7 = ( k + 2127912214 );
				int _8 = ( k << 12 );
				int _9 = ( _7 + _8 );
				k = _9;
				int _10 = ( k ^ -949894596 );
				int _11 = ( k >> 19 );
				int _12 = ( _10 ^ _11 );
				k = _12;
				int _13 = ( k + 374761393 );
				int _14 = ( k << 5 );
				int _15 = ( _13 + _14 );
				k = _15;
				int _16 = ( k + -744332180 );
				int _17 = ( k << 9 );
				int _18 = ( _16 ^ _17 );
				k = _18;
				int _19 = ( k + -42973499 );
				int _20 = ( k << 3 );
				int _21 = ( _19 + _20 );
				k = _21;
				int _22 = ( k ^ -1252372727 );
				int _23 = ( k >> 16 );
				int _24 = ( _22 ^ _23 );
				k = _24;
				int ret = k;
				int _25 = ( ret & -2 );
				boolean _26 = ( _25 == 0 );
				if (_26) 
				{
					boolean _27 = ( ret == 0 );
					if (_27) 
					{
						ret = 2;
					}
					 else 
					{
						ret = -1;
					}
					
				}
				
				_28 = ret;
			}
			
			int hash = _28;
			int k1 = hash;
			int nProbes = 0;
			int _29 = ( k1 & mask );
			int i = _29;
			int last = i;
			int flag = 0;
			while (true)
			{
				boolean _32 = false;
				{
					int _30 = hashes[i];
					flag = _30;
					int _31 = flag;
					int v = _31;
					_32 = ( v == 0 );
				}
				
				boolean _39 =  ! (_32) ;
				boolean _45 = false;
				if (_39) 
				{
					boolean _40 = ( flag == 1 );
					boolean _33 = _40;
					boolean _41 =  ! (_33) ;
					boolean _34 = _41;
					boolean _36 = false;
					if (_34) 
					{
						boolean _42 = ( flag != k1 );
						_36 = _42;
					}
					 else 
					{
						_36 = true;
					}
					
					boolean _43 =  ! (_36) ;
					boolean _37 = _43;
					if (_37) 
					{
						boolean _44 = keys[i].equals(key);
						boolean _38 = _44;
						boolean _35 = _38;
						_45 =  ! (_35) ;
					}
					 else 
					{
						_45 = true;
					}
					
				}
				 else 
				{
					_45 = false;
				}
				
				boolean _46 =  ! (_45) ;
				if (_46) 
				{
					break;
				}
				
				int _47 =  ++ nProbes;
				int _48 = ( i + _47 );
				int _49 = ( _48 & mask );
				i = _49;
			}
			
			int _50 = ( flag & -2 );
			boolean _51 = ( _50 == 0 );
			int _52 = 0;
			if (_51) 
			{
				_52 = -1;
			}
			 else 
			{
				_52 = i;
			}
			
			return _52;
		}
		
		return -1;
	}
	
	
	public   void resize(int newNBuckets)
	{
		int[] newHash = null;
		int j = 1;
		{
			int _5 = 0;
			{
				int x = newNBuckets;
				 -- x;
				int _0 = ( x >>> 1 );
				x |= _0;
				int _1 = ( x >>> 2 );
				x |= _1;
				int _2 = ( x >>> 4 );
				x |= _2;
				int _3 = ( x >>> 8 );
				x |= _3;
				int _4 = ( x >>> 16 );
				x |= _4;
				_5 =  ++ x;
			}
			
			newNBuckets = _5;
			boolean _6 = ( newNBuckets < 4 );
			if (_6) 
			{
				newNBuckets = 4;
			}
			
			int _7 = this.size;
			double _8 = ( newNBuckets * 0.77 );
			double _9 = ( _8 + 0.5 );
			boolean _10 = ( _7 >= _9 );
			if (_10) 
			{
				j = 0;
			}
			 else 
			{
				int nfSize = newNBuckets;
				int[] _11 = new int[((int) (nfSize) )];
				newHash = _11;
				int _12 = this.nBuckets;
				boolean _13 = ( _12 < newNBuckets );
				if (_13) 
				{
					K[] _14 = ((K[]) (((java.lang.Object) (new java.lang.Object[((int) (newNBuckets) )]) )) );
					K[] k = _14;
					K[] _15 = this._keys;
					boolean _16 = ( _15 != null );
					if (_16) 
					{
						K[] _17 = this._keys;
						int _18 = this.nBuckets;
						java.lang.System.arraycopy(((java.lang.Object) (_17) ), ((int) (0) ), ((java.lang.Object) (k) ), ((int) (0) ), ((int) (_18) ));
					}
					
					this._keys = k;
					V[] _19 = ((V[]) (((java.lang.Object) (new java.lang.Object[((int) (newNBuckets) )]) )) );
					V[] v = _19;
					V[] _20 = this.vals;
					boolean _21 = ( _20 != null );
					if (_21) 
					{
						V[] _22 = this.vals;
						int _23 = this.nBuckets;
						java.lang.System.arraycopy(((java.lang.Object) (_22) ), ((int) (0) ), ((java.lang.Object) (v) ), ((int) (0) ), ((int) (_23) ));
					}
					
					this.vals = v;
				}
				
			}
			
		}
		
		boolean _24 = ( j != 0 );
		if (_24) 
		{
			this.cachedKey = null;
			this.cachedIndex = -1;
			j = -1;
			int _25 = this.nBuckets;
			int nBuckets = _25;
			K[] _26 = this._keys;
			K[] _keys = _26;
			V[] _27 = this.vals;
			V[] vals = _27;
			int[] _28 = this.hashes;
			int[] hashes = _28;
			int _29 = ( newNBuckets - 1 );
			int newMask = _29;
			while (true)
			{
				int _30 =  ++ j;
				boolean _31 = ( _30 < nBuckets );
				boolean _32 =  ! (_31) ;
				if (_32) 
				{
					break;
				}
				
				int k1 = 0;
				boolean _36 = false;
				{
					int _33 = hashes[j];
					k1 = _33;
					int _34 = k1;
					int v1 = _34;
					int _35 = ( v1 & -2 );
					_36 = ( _35 == 0 );
				}
				
				boolean _37 =  ! (_36) ;
				if (_37) 
				{
					K _38 = _keys[j];
					K key = _38;
					V _39 = vals[j];
					V val = _39;
					hashes[j] = 1;
					while (true)
					{
						boolean _40 =  ! (true) ;
						if (_40) 
						{
							break;
						}
						
						int nProbes = 0;
						int _41 = ( k1 & newMask );
						int i = _41;
						while (true)
						{
							int _42 = newHash[i];
							boolean _43 = ( _42 == 0 );
							boolean _44 =  ! (_43) ;
							boolean _45 =  ! (_44) ;
							if (_45) 
							{
								break;
							}
							
							int _46 =  ++ nProbes;
							int _47 = ( i + _46 );
							int _48 = ( _47 & newMask );
							i = _48;
						}
						
						newHash[i] = k1;
						boolean _53 = ( i < nBuckets );
						boolean _57 = false;
						if (_53) 
						{
							boolean _52 = false;
							{
								int _54 = hashes[i];
								int _49 = _54;
								k1 = _49;
								int _50 = k1;
								int v2 = _50;
								int _55 = ( v2 & -2 );
								int _51 = _55;
								boolean _56 = ( _51 == 0 );
								_52 = _56;
							}
							
							_57 =  ! (_52) ;
						}
						 else 
						{
							_57 = false;
						}
						
						if (_57) 
						{
							{
								K _58 = _keys[i];
								K tmp = _58;
								_keys[i] = key;
								key = tmp;
							}
							
							{
								V _59 = vals[i];
								V tmp1 = _59;
								vals[i] = val;
								val = tmp1;
							}
							
							hashes[i] = 1;
						}
						 else 
						{
							_keys[i] = key;
							vals[i] = val;
							break;
						}
						
					}
					
				}
				
			}
			
			boolean _60 = ( nBuckets > newNBuckets );
			if (_60) 
			{
				{
					K[] _61 = ((K[]) (((java.lang.Object) (new java.lang.Object[((int) (newNBuckets) )]) )) );
					K[] k2 = _61;
					java.lang.System.arraycopy(((java.lang.Object) (_keys) ), ((int) (0) ), ((java.lang.Object) (k2) ), ((int) (0) ), ((int) (newNBuckets) ));
					this._keys = k2;
				}
				
				{
					V[] _62 = ((V[]) (((java.lang.Object) (new java.lang.Object[((int) (newNBuckets) )]) )) );
					V[] v3 = _62;
					java.lang.System.arraycopy(((java.lang.Object) (vals) ), ((int) (0) ), ((java.lang.Object) (v3) ), ((int) (0) ), ((int) (newNBuckets) ));
					this.vals = v3;
				}
				
			}
			
			this.hashes = newHash;
			this.nBuckets = newNBuckets;
			int _63 = this.size;
			this.nOccupied = _63;
			double _64 = ( newNBuckets * 0.77 );
			int _65 = ((int) (( _64 + .5 )) );
			this.upperBound = _65;
		}
		
	}
	
	
	public   V get(K key)
	{
		int idx = -1;
		K _0 = this.cachedKey;
		boolean _3 = haxe.lang.Runtime.eq(_0, key);
		boolean _5 = false;
		if (_3) 
		{
			int _4 = this.cachedIndex;
			int _1 = _4;
			idx = _1;
			int _2 = idx;
			_5 = ( _2 != -1 );
		}
		 else 
		{
			_5 = false;
		}
		
		if (_5) 
		{
			V[] _6 = this.vals;
			V _7 = _6[idx];
			return _7;
		}
		
		int _8 = this.lookup(key);
		idx = _8;
		boolean _9 = ( idx != -1 );
		if (_9) 
		{
			this.cachedKey = key;
			this.cachedIndex = idx;
			V[] _10 = this.vals;
			V _11 = _10[idx];
			return _11;
		}
		
		return null;
	}
	
	
	@Override public   double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef88 = true;
			switch (field.hashCode())
			{
				case 1005083856:
				{
					if (field.equals("cachedIndex")) 
					{
						__temp_executeDef88 = false;
						this.cachedIndex = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 325636987:
				{
					if (field.equals("nBuckets")) 
					{
						__temp_executeDef88 = false;
						this.nBuckets = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -553141795:
				{
					if (field.equals("cachedKey")) 
					{
						__temp_executeDef88 = false;
						this.cachedKey = ((K) (((java.lang.Object) (value) )) );
						return ((double) (haxe.lang.Runtime.toDouble(((java.lang.Object) (value) ))) );
					}
					
					break;
				}
				
				
				case 3530753:
				{
					if (field.equals("size")) 
					{
						__temp_executeDef88 = false;
						this.size = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -1690761732:
				{
					if (field.equals("upperBound")) 
					{
						__temp_executeDef88 = false;
						this.upperBound = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -394102484:
				{
					if (field.equals("nOccupied")) 
					{
						__temp_executeDef88 = false;
						this.nOccupied = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef88) 
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
			boolean __temp_executeDef89 = true;
			switch (field.hashCode())
			{
				case 1005083856:
				{
					if (field.equals("cachedIndex")) 
					{
						__temp_executeDef89 = false;
						this.cachedIndex = ((int) (haxe.lang.Runtime.toInt(value)) );
						return value;
					}
					
					break;
				}
				
				
				case -1224424900:
				{
					if (field.equals("hashes")) 
					{
						__temp_executeDef89 = false;
						this.hashes = ((int[]) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -553141795:
				{
					if (field.equals("cachedKey")) 
					{
						__temp_executeDef89 = false;
						this.cachedKey = ((K) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 91023059:
				{
					if (field.equals("_keys")) 
					{
						__temp_executeDef89 = false;
						this._keys = ((K[]) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -1690761732:
				{
					if (field.equals("upperBound")) 
					{
						__temp_executeDef89 = false;
						this.upperBound = ((int) (haxe.lang.Runtime.toInt(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 3612018:
				{
					if (field.equals("vals")) 
					{
						__temp_executeDef89 = false;
						this.vals = ((V[]) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -394102484:
				{
					if (field.equals("nOccupied")) 
					{
						__temp_executeDef89 = false;
						this.nOccupied = ((int) (haxe.lang.Runtime.toInt(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 325636987:
				{
					if (field.equals("nBuckets")) 
					{
						__temp_executeDef89 = false;
						this.nBuckets = ((int) (haxe.lang.Runtime.toInt(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 3530753:
				{
					if (field.equals("size")) 
					{
						__temp_executeDef89 = false;
						this.size = ((int) (haxe.lang.Runtime.toInt(value)) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef89) 
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
			boolean __temp_executeDef90 = true;
			switch (field.hashCode())
			{
				case 102230:
				{
					if (field.equals("get")) 
					{
						__temp_executeDef90 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("get"))) );
					}
					
					break;
				}
				
				
				case -1224424900:
				{
					if (field.equals("hashes")) 
					{
						__temp_executeDef90 = false;
						return this.hashes;
					}
					
					break;
				}
				
				
				case -934437708:
				{
					if (field.equals("resize")) 
					{
						__temp_executeDef90 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("resize"))) );
					}
					
					break;
				}
				
				
				case 91023059:
				{
					if (field.equals("_keys")) 
					{
						__temp_executeDef90 = false;
						return this._keys;
					}
					
					break;
				}
				
				
				case -1097094790:
				{
					if (field.equals("lookup")) 
					{
						__temp_executeDef90 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("lookup"))) );
					}
					
					break;
				}
				
				
				case 3612018:
				{
					if (field.equals("vals")) 
					{
						__temp_executeDef90 = false;
						return this.vals;
					}
					
					break;
				}
				
				
				case 113762:
				{
					if (field.equals("set")) 
					{
						__temp_executeDef90 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("set"))) );
					}
					
					break;
				}
				
				
				case 325636987:
				{
					if (field.equals("nBuckets")) 
					{
						__temp_executeDef90 = false;
						return this.nBuckets;
					}
					
					break;
				}
				
				
				case 1005083856:
				{
					if (field.equals("cachedIndex")) 
					{
						__temp_executeDef90 = false;
						return this.cachedIndex;
					}
					
					break;
				}
				
				
				case 3530753:
				{
					if (field.equals("size")) 
					{
						__temp_executeDef90 = false;
						return this.size;
					}
					
					break;
				}
				
				
				case -553141795:
				{
					if (field.equals("cachedKey")) 
					{
						__temp_executeDef90 = false;
						return this.cachedKey;
					}
					
					break;
				}
				
				
				case -394102484:
				{
					if (field.equals("nOccupied")) 
					{
						__temp_executeDef90 = false;
						return this.nOccupied;
					}
					
					break;
				}
				
				
				case -1690761732:
				{
					if (field.equals("upperBound")) 
					{
						__temp_executeDef90 = false;
						return this.upperBound;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef90) 
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
			boolean __temp_executeDef91 = true;
			switch (field.hashCode())
			{
				case 1005083856:
				{
					if (field.equals("cachedIndex")) 
					{
						__temp_executeDef91 = false;
						return ((double) (this.cachedIndex) );
					}
					
					break;
				}
				
				
				case 325636987:
				{
					if (field.equals("nBuckets")) 
					{
						__temp_executeDef91 = false;
						return ((double) (this.nBuckets) );
					}
					
					break;
				}
				
				
				case -553141795:
				{
					if (field.equals("cachedKey")) 
					{
						__temp_executeDef91 = false;
						return ((double) (haxe.lang.Runtime.toDouble(((java.lang.Object) (this.cachedKey) ))) );
					}
					
					break;
				}
				
				
				case 3530753:
				{
					if (field.equals("size")) 
					{
						__temp_executeDef91 = false;
						return ((double) (this.size) );
					}
					
					break;
				}
				
				
				case -1690761732:
				{
					if (field.equals("upperBound")) 
					{
						__temp_executeDef91 = false;
						return ((double) (this.upperBound) );
					}
					
					break;
				}
				
				
				case -394102484:
				{
					if (field.equals("nOccupied")) 
					{
						__temp_executeDef91 = false;
						return ((double) (this.nOccupied) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef91) 
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
			boolean __temp_executeDef92 = true;
			switch (field.hashCode())
			{
				case 102230:
				{
					if (field.equals("get")) 
					{
						__temp_executeDef92 = false;
						return this.get(((K) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case 113762:
				{
					if (field.equals("set")) 
					{
						__temp_executeDef92 = false;
						this.set(((K) (dynargs.__get(0)) ), ((V) (dynargs.__get(1)) ));
					}
					
					break;
				}
				
				
				case -934437708:
				{
					if (field.equals("resize")) 
					{
						__temp_executeDef92 = false;
						this.resize(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					break;
				}
				
				
				case -1097094790:
				{
					if (field.equals("lookup")) 
					{
						__temp_executeDef92 = false;
						return this.lookup(((K) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef92) 
			{
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		return null;
	}
	
	
	@Override public   void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("cachedIndex");
		baseArr.push("cachedKey");
		baseArr.push("upperBound");
		baseArr.push("nOccupied");
		baseArr.push("size");
		baseArr.push("nBuckets");
		baseArr.push("vals");
		baseArr.push("_keys");
		baseArr.push("hashes");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


