# ModSurveyGetQuestions200ResponseQuestionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** | Question id | [optional] [default to null]
**Intro** | Pointer to **string** | The question intro | [optional] [default to "null"]
**Multi** | Pointer to **string** | Subquestions ids | [optional] [default to "null"]
**Options** | Pointer to **string** | Question options | [optional] [default to "null"]
**Parent** | Pointer to **int32** | Parent question (for subquestions) | [optional] [default to null]
**Shorttext** | Pointer to **string** | Question short text | [optional] [default to "null"]
**Text** | Pointer to **string** | Question text | [optional] [default to "null"]
**Type** | Pointer to **int32** | Question type | [optional] [default to null]

## Methods

### NewModSurveyGetQuestions200ResponseQuestionsInner

`func NewModSurveyGetQuestions200ResponseQuestionsInner() *ModSurveyGetQuestions200ResponseQuestionsInner`

NewModSurveyGetQuestions200ResponseQuestionsInner instantiates a new ModSurveyGetQuestions200ResponseQuestionsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModSurveyGetQuestions200ResponseQuestionsInnerWithDefaults

`func NewModSurveyGetQuestions200ResponseQuestionsInnerWithDefaults() *ModSurveyGetQuestions200ResponseQuestionsInner`

NewModSurveyGetQuestions200ResponseQuestionsInnerWithDefaults instantiates a new ModSurveyGetQuestions200ResponseQuestionsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIntro

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetMulti

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) GetMulti() string`

GetMulti returns the Multi field if non-nil, zero value otherwise.

### GetMultiOk

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) GetMultiOk() (*string, bool)`

GetMultiOk returns a tuple with the Multi field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMulti

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) SetMulti(v string)`

SetMulti sets Multi field to given value.

### HasMulti

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) HasMulti() bool`

HasMulti returns a boolean if a field has been set.

### GetOptions

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) GetOptions() string`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) GetOptionsOk() (*string, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) SetOptions(v string)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) HasOptions() bool`

HasOptions returns a boolean if a field has been set.

### GetParent

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) GetParent() int32`

GetParent returns the Parent field if non-nil, zero value otherwise.

### GetParentOk

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) GetParentOk() (*int32, bool)`

GetParentOk returns a tuple with the Parent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParent

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) SetParent(v int32)`

SetParent sets Parent field to given value.

### HasParent

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) HasParent() bool`

HasParent returns a boolean if a field has been set.

### GetShorttext

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) GetShorttext() string`

GetShorttext returns the Shorttext field if non-nil, zero value otherwise.

### GetShorttextOk

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) GetShorttextOk() (*string, bool)`

GetShorttextOk returns a tuple with the Shorttext field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShorttext

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) SetShorttext(v string)`

SetShorttext sets Shorttext field to given value.

### HasShorttext

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) HasShorttext() bool`

HasShorttext returns a boolean if a field has been set.

### GetText

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) SetText(v string)`

SetText sets Text field to given value.

### HasText

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) HasText() bool`

HasText returns a boolean if a field has been set.

### GetType

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) GetType() int32`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) GetTypeOk() (*int32, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) SetType(v int32)`

SetType sets Type field to given value.

### HasType

`func (o *ModSurveyGetQuestions200ResponseQuestionsInner) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


