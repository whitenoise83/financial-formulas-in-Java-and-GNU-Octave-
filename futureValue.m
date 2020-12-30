%Future value calculator
% N = Number of compounding periods
% IY = I/Y = Periodic Interest Rate (r)
% PV = Present Value of the money
% FV = Future Value of the money
    
% ***********************************************************************************************
% ***********************************************************************************************
% Example-1: What is the futute value of $ 1000 in two years with a yearly interest rate of %6 ?
% PV = $ 1000
% I/Y = 0.06 (yearly interest rate)
% N = 2 years
% ***********************************************************************************************
% ***********************************************************************************************
% Example-2: What is the futute value of $ 1000 in three months with a yearly interest rate of %6 ?
% PV = $ 1000
% I/Y = 0.06/12 = 0.005 (monthly interest rate)
% N = 3 months
% ***********************************************************************************************
% ***********************************************************************************************

function [FV] = futureValue(PV, IY, N)
	FV = PV * (1 + IY)^N;
endfunction