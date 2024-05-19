# ModQuizGetAttemptData200ResponseAttempt

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attempt** | Option<**i32**> | Sequentially numbers this students attempts at this quiz. | [optional][default to null]
**currentpage** | Option<**i32**> | Attempt current page. | [optional][default to null]
**gradednotificationsenttime** | Option<**i32**> | Time when the student was notified that manual grading of their attempt was complete. | [optional][default to null]
**id** | Option<**i32**> | Attempt id. | [optional][default to null]
**layout** | Option<**String**> | Attempt layout. | [optional][default to null]
**preview** | Option<**i32**> | Whether is a preview attempt or not. | [optional][default to null]
**quiz** | Option<**i32**> | Foreign key reference to the quiz that was attempted. | [optional][default to null]
**state** | Option<**String**> | The current state of the attempts. 'inprogress',                                                 'overdue', 'finished' or 'abandoned'. | [optional][default to null]
**sumgrades** | Option<**f64**> | Total marks for this attempt. | [optional][default to null]
**timecheckstate** | Option<**i32**> | Next time quiz cron should check attempt for                                                         state changes.  NULL means never check. | [optional][default to null]
**timefinish** | Option<**i32**> | Time when the attempt was submitted.                                                     0 if the attempt has not been submitted yet. | [optional][default to null]
**timemodified** | Option<**i32**> | Last modified time. | [optional][default to null]
**timemodifiedoffline** | Option<**i32**> | Last modified time via webservices. | [optional]
**timestart** | Option<**i32**> | Time when the attempt was started. | [optional][default to null]
**uniqueid** | Option<**i32**> | Foreign key reference to the question_usage that holds the                                                     details of the the question_attempts that make up this quiz                                                     attempt. | [optional][default to null]
**userid** | Option<**i32**> | Foreign key reference to the user whose attempt this is. | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


