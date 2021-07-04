use spj;


create table s(Sno char(4), Sname char(20), Status int, City char(20));

create table p(Pno char(4), Pname char(20), Color char(20) , Weight int, City char(20));


create table j (Jno char(4), Jname char(20), City char(20));

create table spj (Sno char(4) ,Pno char(4) ,Jno char(4),Qty char(4));
;
insert into s (Sno , Sname , Status , City ) values
				( 'S1' , 'yadav' ,10,'London'),
                ( 'S2' , 'jawale' ,20,'paris'),
                ( 'S3' , 'patil' ,30,'Athens');
             
insert into p (Pno , Pname , color ,weight , City ) values
				( 'P1' , 'part01' ,'red',15,'London'),
                ( 'P2' , 'part02' ,'green',25,'paris'),
                ( 'P3' , 'part03' ,'black',35,'Athens');
                
insert into j (Jno , Jname  , City ) values
				( 'J1' , 'project01' ,'London'),
                ( 'J2' , 'project02' ,'paris'),
                ( 'J3' , 'project03' ,'Athens');                
                
insert into spj (Sno ,Pno  ,Jno ,Qty ) values 
				('S1','P1' ,'J1' ,5),
                ('S2','P2' ,'J2' ,4),
                ('S3','P3' ,'J3' ,3);
                
                
 select * from s
where city='London';

select * from s
where city !='London';         

select * from j
where city ='Athens';     

select Pname from p
#where Weigth between 15 and 20;
where 15<Weight and 20>Weight;

select * from s
where status <=20;

select * from s
where city!='London';


select City from s;


select Weight "grams" , (Weight*1000) "Miligrams" , (Weight/ 1000) "Kilograms" from p;

 