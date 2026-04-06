-- 코드를 입력하세요
SELECT
    -- 컬럼명 변경
    -- 진료과 코드
    MCDP_CD AS '진료과 코드',
    -- 5월 예약 건수
    COUNT(*) AS '5월예약건수'


FROM APPOINTMENT


WHERE APNT_YMD >= '2022-05-01'
  AND APNT_YMD < '2022-06-01'
  
-- 묶어주기
GROUP BY MCDP_CD

-- count, 오름차순
ORDER BY COUNT(*) ASC, MCDP_CD ASC
;