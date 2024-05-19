# MoodleClient.Model.ModQuizGetAttemptData200ResponseAttempt

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attempt** | **int** | Sequentially numbers this students attempts at this quiz. | [optional] [default to null]
**Currentpage** | **int** | Attempt current page. | [optional] [default to null]
**Gradednotificationsenttime** | **int** | Time when the student was notified that manual grading of their attempt was complete. | [optional] [default to null]
**Id** | **int** | Attempt id. | [optional] [default to null]
**Layout** | **string** | Attempt layout. | [optional] [default to "null"]
**Preview** | **int** | Whether is a preview attempt or not. | [optional] [default to null]
**Quiz** | **int** | Foreign key reference to the quiz that was attempted. | [optional] [default to null]
**State** | **string** | The current state of the attempts. &#39;inprogress&#39;,                                                 &#39;overdue&#39;, &#39;finished&#39; or &#39;abandoned&#39;. | [optional] [default to "null"]
**Sumgrades** | **decimal** | Total marks for this attempt. | [optional] [default to nullM]
**Timecheckstate** | **int** | Next time quiz cron should check attempt for                                                         state changes.  NULL means never check. | [optional] [default to null]
**Timefinish** | **int** | Time when the attempt was submitted.                                                     0 if the attempt has not been submitted yet. | [optional] [default to null]
**Timemodified** | **int** | Last modified time. | [optional] [default to null]
**Timemodifiedoffline** | **int** | Last modified time via webservices. | [optional] 
**Timestart** | **int** | Time when the attempt was started. | [optional] [default to null]
**Uniqueid** | **int** | Foreign key reference to the question_usage that holds the                                                     details of the the question_attempts that make up this quiz                                                     attempt. | [optional] [default to null]
**Userid** | **int** | Foreign key reference to the user whose attempt this is. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

