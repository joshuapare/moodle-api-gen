# # ModQuizGetAttemptData200ResponseAttempt

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attempt** | **int** | Sequentially numbers this students attempts at this quiz. | [optional] [default to null]
**currentpage** | **int** | Attempt current page. | [optional] [default to null]
**gradednotificationsenttime** | **int** | Time when the student was notified that manual grading of their attempt was complete. | [optional] [default to null]
**id** | **int** | Attempt id. | [optional] [default to null]
**layout** | **string** | Attempt layout. | [optional] [default to 'null']
**preview** | **int** | Whether is a preview attempt or not. | [optional] [default to null]
**quiz** | **int** | Foreign key reference to the quiz that was attempted. | [optional] [default to null]
**state** | **string** | The current state of the attempts. &#39;inprogress&#39;,                                                 &#39;overdue&#39;, &#39;finished&#39; or &#39;abandoned&#39;. | [optional] [default to 'null']
**sumgrades** | **float** | Total marks for this attempt. | [optional] [default to null]
**timecheckstate** | **int** | Next time quiz cron should check attempt for                                                         state changes.  NULL means never check. | [optional] [default to null]
**timefinish** | **int** | Time when the attempt was submitted.                                                     0 if the attempt has not been submitted yet. | [optional] [default to null]
**timemodified** | **int** | Last modified time. | [optional] [default to null]
**timemodifiedoffline** | **int** | Last modified time via webservices. | [optional]
**timestart** | **int** | Time when the attempt was started. | [optional] [default to null]
**uniqueid** | **int** | Foreign key reference to the question_usage that holds the                                                     details of the the question_attempts that make up this quiz                                                     attempt. | [optional] [default to null]
**userid** | **int** | Foreign key reference to the user whose attempt this is. | [optional] [default to null]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
