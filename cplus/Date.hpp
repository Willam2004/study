class Date{
	private:
		int d,m,y;

	public:
		Date(int dd=0,int mm =0, int yy =0);
		int day() const{return d;}
		int month() const{return m;}
		int year() const{return y;}
};
