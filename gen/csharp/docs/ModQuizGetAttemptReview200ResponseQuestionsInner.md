# MoodleClient.Model.ModQuizGetAttemptReview200ResponseQuestionsInner
The question data. Some fields may not be returned depending on the quiz display settings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Blockedbyprevious** | **bool** | whether the question is blocked by the previous question | [optional] 
**Flagged** | **bool** | whether the question is flagged or not | [optional] 
**Hasautosavedstep** | **bool** | whether this question attempt has autosaved data | [optional] 
**Html** | **string** | the question rendered | [optional] 
**Lastactiontime** | **int** | the timestamp of the most recent step in this question attempt | [optional] 
**Mark** | **string** | the mark awarded.                     It will be returned only if the user is allowed to see it. | [optional] 
**Maxmark** | **decimal** | the maximum mark possible for this question attempt.                     It will be returned only if the user is allowed to see it. | [optional] 
**Number** | **int** | DO NOT USE. Use questionnumber. Only retained for backwards compatibility. | [optional] 
**Page** | **int** | page of the quiz this question appears on | [optional] 
**Questionnumber** | **string** | The question number to display for this question, e.g. \&quot;7\&quot;, \&quot;i\&quot; or \&quot;Custom-B)\&quot;. | [optional] 
**Responsefileareas** | [**List&lt;ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner&gt;**](ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner.md) |  | [optional] 
**Sequencecheck** | **int** | the number of real steps in this attempt | [optional] 
**Settings** | **string** | Question settings (JSON encoded). | [optional] 
**Slot** | **int** | slot number | [optional] 
**State** | **string** | the state where the question is in.                     It will not be returned if the user cannot see it due to the quiz display correctness settings. | [optional] 
**Status** | **string** | current formatted state of the question | [optional] 
**Type** | **string** | question type, i.e: multichoice | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

