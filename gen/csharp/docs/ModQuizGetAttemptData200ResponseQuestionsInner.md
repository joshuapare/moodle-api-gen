# MoodleClient.Model.ModQuizGetAttemptData200ResponseQuestionsInner
The question data. Some fields may not be returned depending on the quiz display settings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Blockedbyprevious** | **bool** | whether the question is blocked by the previous question | [optional] [default to null]
**Flagged** | **bool** | whether the question is flagged or not | [optional] [default to null]
**Hasautosavedstep** | **bool** | whether this question attempt has autosaved data | [optional] [default to null]
**Html** | **string** | the question rendered | [optional] [default to "null"]
**Lastactiontime** | **int** | the timestamp of the most recent step in this question attempt | [optional] [default to null]
**Mark** | **string** | the mark awarded.                     It will be returned only if the user is allowed to see it. | [optional] [default to "null"]
**Maxmark** | **decimal** | the maximum mark possible for this question attempt.                     It will be returned only if the user is allowed to see it. | [optional] [default to nullM]
**Number** | **int** | DO NOT USE. Use questionnumber. Only retained for backwards compatibility. | [optional] [default to null]
**Page** | **int** | page of the quiz this question appears on | [optional] [default to null]
**Questionnumber** | **string** | The question number to display for this question, e.g. \&quot;7\&quot;, \&quot;i\&quot; or \&quot;Custom-B)\&quot;. | [optional] [default to "null"]
**Responsefileareas** | [**List&lt;ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner&gt;**](ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner.md) |  | [optional] 
**Sequencecheck** | **int** | the number of real steps in this attempt | [optional] [default to null]
**Settings** | **string** | Question settings (JSON encoded). | [optional] [default to "null"]
**Slot** | **int** | slot number | [optional] [default to null]
**State** | **string** | the state where the question is in.                     It will not be returned if the user cannot see it due to the quiz display correctness settings. | [optional] [default to "null"]
**Status** | **string** | current formatted state of the question | [optional] [default to "null"]
**Type** | **string** | question type, i.e: multichoice | [optional] [default to "null"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

