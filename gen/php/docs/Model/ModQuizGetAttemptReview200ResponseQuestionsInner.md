# # ModQuizGetAttemptReview200ResponseQuestionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blockedbyprevious** | **bool** | whether the question is blocked by the previous question | [optional]
**flagged** | **bool** | whether the question is flagged or not | [optional]
**hasautosavedstep** | **bool** | whether this question attempt has autosaved data | [optional]
**html** | **string** | the question rendered | [optional]
**lastactiontime** | **int** | the timestamp of the most recent step in this question attempt | [optional]
**mark** | **string** | the mark awarded.                     It will be returned only if the user is allowed to see it. | [optional]
**maxmark** | **float** | the maximum mark possible for this question attempt.                     It will be returned only if the user is allowed to see it. | [optional]
**number** | **int** | DO NOT USE. Use questionnumber. Only retained for backwards compatibility. | [optional]
**page** | **int** | page of the quiz this question appears on | [optional]
**questionnumber** | **string** | The question number to display for this question, e.g. \&quot;7\&quot;, \&quot;i\&quot; or \&quot;Custom-B)\&quot;. | [optional]
**responsefileareas** | [**\OpenAPI\Client\Model\ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner[]**](ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner.md) |  | [optional]
**sequencecheck** | **int** | the number of real steps in this attempt | [optional]
**settings** | **string** | Question settings (JSON encoded). | [optional]
**slot** | **int** | slot number | [optional]
**state** | **string** | the state where the question is in.                     It will not be returned if the user cannot see it due to the quiz display correctness settings. | [optional]
**status** | **string** | current formatted state of the question | [optional]
**type** | **string** | question type, i.e: multichoice | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
