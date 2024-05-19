# MoodleClient.Model.ModQuizGetAttemptReview200ResponseAttempt

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attempt** | **int** | Sequentially numbers this students attempts at this quiz. | [optional] 
**Currentpage** | **int** | Attempt current page. | [optional] 
**Gradednotificationsenttime** | **int** | Time when the student was notified that manual grading of their attempt was complete. | [optional] 
**Id** | **int** | Attempt id. | [optional] 
**Layout** | **string** | Attempt layout. | [optional] 
**Preview** | **int** | Whether is a preview attempt or not. | [optional] 
**Quiz** | **int** | Foreign key reference to the quiz that was attempted. | [optional] 
**State** | **string** | The current state of the attempts. &#39;inprogress&#39;,                                                 &#39;overdue&#39;, &#39;finished&#39; or &#39;abandoned&#39;. | [optional] 
**Sumgrades** | **decimal** | Total marks for this attempt. | [optional] 
**Timecheckstate** | **int** | Next time quiz cron should check attempt for                                                         state changes.  NULL means never check. | [optional] 
**Timefinish** | **int** | Time when the attempt was submitted.                                                     0 if the attempt has not been submitted yet. | [optional] 
**Timemodified** | **int** | Last modified time. | [optional] 
**Timemodifiedoffline** | **int** | Last modified time via webservices. | [optional] 
**Timestart** | **int** | Time when the attempt was started. | [optional] 
**Uniqueid** | **int** | Foreign key reference to the question_usage that holds the                                                     details of the the question_attempts that make up this quiz                                                     attempt. | [optional] 
**Userid** | **int** | Foreign key reference to the user whose attempt this is. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

