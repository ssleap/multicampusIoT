SELECT * FROM TAB;


select hire_month as "월", count(*) as "입사자수"
from (select to_char(hire_date, 'mm') as hire_month from employees)
group by hire_month
order by hire_month;

