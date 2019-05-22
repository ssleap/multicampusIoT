select * from dept;

select * from emp;

select ename, sal, comm from emp;

select ename, mgr from emp;

--null 일 때 nvl 함수 사용하여 따로 표기 가능
select e.ename, nvl(to_char(e.mgr), '없음') as 매니저 from emp e;

select ename, mgr ,'sql' as 에스큐엘 from emp;

select ename, sal, comm, sal + nvl(comm, 0) as 지급액 from emp;

select ename, sal, comm, sal + nvl(comm, 0) || '원' as 지급액 from emp;

-- ||은 concat
select job || hiredate || deptno from emp;

select sysdate from emp;

select sysdate from dept;

select sysdate, 3 + 7 + 8 from dual;

select * from emp where sal > 3000;

select * from emp where job = 'CLERK';

select * from emp where job = 'cLERK';

select * from emp where job = upper('clerk');

select * from emp where upper(job) = upper('clerk');

select * from emp where upper(job) != upper('clerk');

select * from emp where hiredate > '81/05/15';

select * from emp where sal > 2000 and sal <= 3000;

select * from emp where sal between 3000 and 5000;

select * from emp where sal not between 3000 and 5000;

select * from emp where deptno = 10 or deptno = 20;

select * from emp where deptno in(10, 20);

select * from emp where deptno not in(10, 20);

-- <> : not. all과 any는 혼자 쓰일 수 없다.
select * from emp where deptno <> all(10, 20);

select * from dept;

select * from dept where deptno = 20 and loc = 'DALLAS';

select * from dept where deptno = 30 and loc = 'CHICAGO';

select * from dept where (deptno = 20 and loc = 'DALLAS') or 
	(deptno = 30 and loc = 'CHICAGO');
	
select * from dept where deptno = 20 and loc = 'DALLAS' or 
	deptno = 30 and loc = 'CHICAGO';
	
select * from dept where (deptno, loc) in ((20, 'DALLAS'),
	(30, 'CHICAGO'));
	
select * from emp where ename = 'KING';

select * from emp where job = 'S%';

select * from emp where job like 'S%';

select * 
	from emp 
	where upper(ename) like '%' || 
		upper('M') || 
		'%';

select * from emp where ename like upper('%M%');

select * from emp where hiredate like '82%';

select * from emp where hiredate 
	between '82/01/01' and '82/12/31';
	
-- null 은 is를 써야한다.
select *from emp where comm = null;

select *from emp where comm is null;

select *from emp where comm is not null;

select * from emp order by deptno;

select * from emp order by 5, deptno;

select * from emp order by deptno desc;

select * from emp order by deptno, empno;

select ename, sal, comm, sal+nvl(comm, 0) as total
	from emp
	where sal+nvl(comm, 0) > 1000
	order by total;

select sysdate from dual;

select sysdate, to_char(sysdate, 'MM') from dual;

select sysdate, to_char(sysdate, 'YYYY') from dual;

select to_char(hiredate, 'MM') from emp;

select to_char(hiredate, 'day') from emp;

insert into emp values
(9999, 'JAVA01', 'CLERK', '7782', '19/05/15', 900, null, 10);

select * from emp;

rollback;

insert into emp values
	(9991, 'JAVA01', 'CLERK', '7782', 
	to_date('15/19/05','dd/yy/mm'), 900, null, 10);

ROLLBACK;































