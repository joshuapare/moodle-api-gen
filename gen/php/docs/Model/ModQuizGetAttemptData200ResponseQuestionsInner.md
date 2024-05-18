# # ModQuizGetAttemptData200ResponseQuestionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blockedbyprevious** | **bool** | whether the question is blocked by the previous question | [optional] [default to null]
**flagged** | **bool** | whether the question is flagged or not | [optional] [default to null]
**hasautosavedstep** | **bool** | whether this question attempt has autosaved data | [optional] [default to null]
**html** | **string** | the question rendered | [optional] [default to 'null']
**lastactiontime** | **int** | the timestamp of the most recent step in this question attempt | [optional] [default to null]
**mark** | **string** | the mark awarded.                     It will be returned only if the user is allowed to see it. | [optional] [default to 'null']
**maxmark** | **float** | the maximum mark possible for this question attempt.                     It will be returned only if the user is allowed to see it. | [optional] [default to null]
**number** | **int** | DO NOT USE. Use questionnumber. Only retained for backwards compatibility. | [optional] [default to null]
**page** | **int** | page of the quiz this question appears on | [optional] [default to null]
**questionnumber** | **string** | The question number to display for this question, e.g. \&quot;7\&quot;, \&quot;i\&quot; or \&quot;Custom-B)\&quot;. | [optional] [default to 'null']
**responsefileareas** | [**\OpenAPI\Client\Model\ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner[]**](ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner.md) |  | [optional]
**sequencecheck** | **int** | the number of real steps in this attempt | [optional] [default to null]
**settings** | **string** | Question settings (JSON encoded). | [optional] [default to 'null']
**slot** | **int** | slot number | [optional] [default to null]
**state** | **string** | the state where the question is in.                     It will not be returned if the user cannot see it due to the quiz display correctness settings. | [optional] [default to 'null']
**status** | **string** | current formatted state of the question | [optional] [default to 'null']
**type** | **string** | question type, i.e: multichoice | [optional] [default to 'null']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
