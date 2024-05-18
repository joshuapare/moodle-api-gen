# # ModQuizGetUserAttempts200ResponseAttemptsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attempt** | **int** | Sequentially numbers this students attempts at this quiz. | [optional]
**currentpage** | **int** | Attempt current page. | [optional]
**gradednotificationsenttime** | **int** | Time when the student was notified that manual grading of their attempt was complete. | [optional]
**id** | **int** | Attempt id. | [optional]
**layout** | **string** | Attempt layout. | [optional]
**preview** | **int** | Whether is a preview attempt or not. | [optional]
**quiz** | **int** | Foreign key reference to the quiz that was attempted. | [optional]
**state** | **string** | The current state of the attempts. &#39;inprogress&#39;,                                                 &#39;overdue&#39;, &#39;finished&#39; or &#39;abandoned&#39;. | [optional]
**sumgrades** | **float** | Total marks for this attempt. | [optional]
**timecheckstate** | **int** | Next time quiz cron should check attempt for                                                         state changes.  NULL means never check. | [optional]
**timefinish** | **int** | Time when the attempt was submitted.                                                     0 if the attempt has not been submitted yet. | [optional]
**timemodified** | **int** | Last modified time. | [optional]
**timemodifiedoffline** | **int** | Last modified time via webservices. | [optional]
**timestart** | **int** | Time when the attempt was started. | [optional]
**uniqueid** | **int** | Foreign key reference to the question_usage that holds the                                                     details of the the question_attempts that make up this quiz                                                     attempt. | [optional]
**userid** | **int** | Foreign key reference to the user whose attempt this is. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
