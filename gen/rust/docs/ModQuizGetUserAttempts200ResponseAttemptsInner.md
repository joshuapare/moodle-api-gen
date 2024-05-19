# ModQuizGetUserAttempts200ResponseAttemptsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attempt** | Option<**i32**> | Sequentially numbers this students attempts at this quiz. | [optional]
**currentpage** | Option<**i32**> | Attempt current page. | [optional]
**gradednotificationsenttime** | Option<**i32**> | Time when the student was notified that manual grading of their attempt was complete. | [optional]
**id** | Option<**i32**> | Attempt id. | [optional]
**layout** | Option<**String**> | Attempt layout. | [optional]
**preview** | Option<**i32**> | Whether is a preview attempt or not. | [optional]
**quiz** | Option<**i32**> | Foreign key reference to the quiz that was attempted. | [optional]
**state** | Option<**String**> | The current state of the attempts. 'inprogress',                                                 'overdue', 'finished' or 'abandoned'. | [optional]
**sumgrades** | Option<**f64**> | Total marks for this attempt. | [optional]
**timecheckstate** | Option<**i32**> | Next time quiz cron should check attempt for                                                         state changes.  NULL means never check. | [optional]
**timefinish** | Option<**i32**> | Time when the attempt was submitted.                                                     0 if the attempt has not been submitted yet. | [optional]
**timemodified** | Option<**i32**> | Last modified time. | [optional]
**timemodifiedoffline** | Option<**i32**> | Last modified time via webservices. | [optional]
**timestart** | Option<**i32**> | Time when the attempt was started. | [optional]
**uniqueid** | Option<**i32**> | Foreign key reference to the question_usage that holds the                                                     details of the the question_attempts that make up this quiz                                                     attempt. | [optional]
**userid** | Option<**i32**> | Foreign key reference to the user whose attempt this is. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


