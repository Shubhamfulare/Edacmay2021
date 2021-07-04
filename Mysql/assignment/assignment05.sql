-- Display the Supplier name and the Quantity sold.

select Sname, Qty from s,spj; 

-- Display the Part name and Quantity sold.

select Pname , Qty from p,spj
where p.pno=spj.pno;

-- Display the Project name and Quantity sold.

select Jname , Qty from j,spj
where J.Jno=spj.Jno;

-- Display the Supplier name, Part name, Project name and Quantity sold.

select Sname,Pname ,Jname, Qty from s,p,j,spj
where S.Sno=spj.Sno && J.Jno=spj.Jno && P.Pno=spj.Pno;


-- Display the Supplier name, Supplying Parts to a Project in the same City.

select Sname, Pname ;

-- Display the Part name that is ‘Red’ is color, and the Quantity sold.

select pname ,Qty from p,spj
where p.pno=spj.pno && color ='red';


-- Display all the Quantity sold by Suppliers with the Status = 20. 
select Sname ,Qty from s, spj
where S.sno=spj.sno && status = 20; 

-- Display all the Parts and Quantity with a Weight > 14.

select Pname , Qty from p,spj
where weight > 14 && p.pno=spj.pno;


-- Display all the Project names and City, which has bought more than 500 Parts.

select pname ,city from p ,spj where Qty>500 && p.pno=spj.pno;

-- Display all the Part names and Quantity sold that have a Weight less than 15.

select pname ,Qty from p ,spj where Weight<20 && p.pno=spj.pno;

-- Display all the Employee names and the name of their Managers. 



