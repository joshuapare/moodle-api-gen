# ModQuizGetAttemptReview200ResponseQuestionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Blockedbyprevious** | Pointer to **bool** | whether the question is blocked by the previous question | [optional] 
**Flagged** | Pointer to **bool** | whether the question is flagged or not | [optional] 
**Hasautosavedstep** | Pointer to **bool** | whether this question attempt has autosaved data | [optional] 
**Html** | Pointer to **string** | the question rendered | [optional] 
**Lastactiontime** | Pointer to **int32** | the timestamp of the most recent step in this question attempt | [optional] 
**Mark** | Pointer to **string** | the mark awarded.                     It will be returned only if the user is allowed to see it. | [optional] 
**Maxmark** | Pointer to **float32** | the maximum mark possible for this question attempt.                     It will be returned only if the user is allowed to see it. | [optional] 
**Number** | Pointer to **int32** | DO NOT USE. Use questionnumber. Only retained for backwards compatibility. | [optional] 
**Page** | Pointer to **int32** | page of the quiz this question appears on | [optional] 
**Questionnumber** | Pointer to **string** | The question number to display for this question, e.g. \&quot;7\&quot;, \&quot;i\&quot; or \&quot;Custom-B)\&quot;. | [optional] 
**Responsefileareas** | Pointer to [**[]ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner**](ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner.md) |  | [optional] 
**Sequencecheck** | Pointer to **int32** | the number of real steps in this attempt | [optional] 
**Settings** | Pointer to **string** | Question settings (JSON encoded). | [optional] 
**Slot** | Pointer to **int32** | slot number | [optional] 
**State** | Pointer to **string** | the state where the question is in.                     It will not be returned if the user cannot see it due to the quiz display correctness settings. | [optional] 
**Status** | Pointer to **string** | current formatted state of the question | [optional] 
**Type** | Pointer to **string** | question type, i.e: multichoice | [optional] 

## Methods

### NewModQuizGetAttemptReview200ResponseQuestionsInner

`func NewModQuizGetAttemptReview200ResponseQuestionsInner() *ModQuizGetAttemptReview200ResponseQuestionsInner`

NewModQuizGetAttemptReview200ResponseQuestionsInner instantiates a new ModQuizGetAttemptReview200ResponseQuestionsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizGetAttemptReview200ResponseQuestionsInnerWithDefaults

`func NewModQuizGetAttemptReview200ResponseQuestionsInnerWithDefaults() *ModQuizGetAttemptReview200ResponseQuestionsInner`

NewModQuizGetAttemptReview200ResponseQuestionsInnerWithDefaults instantiates a new ModQuizGetAttemptReview200ResponseQuestionsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBlockedbyprevious

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetBlockedbyprevious() bool`

GetBlockedbyprevious returns the Blockedbyprevious field if non-nil, zero value otherwise.

### GetBlockedbypreviousOk

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetBlockedbypreviousOk() (*bool, bool)`

GetBlockedbypreviousOk returns a tuple with the Blockedbyprevious field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlockedbyprevious

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) SetBlockedbyprevious(v bool)`

SetBlockedbyprevious sets Blockedbyprevious field to given value.

### HasBlockedbyprevious

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) HasBlockedbyprevious() bool`

HasBlockedbyprevious returns a boolean if a field has been set.

### GetFlagged

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetFlagged() bool`

GetFlagged returns the Flagged field if non-nil, zero value otherwise.

### GetFlaggedOk

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetFlaggedOk() (*bool, bool)`

GetFlaggedOk returns a tuple with the Flagged field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlagged

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) SetFlagged(v bool)`

SetFlagged sets Flagged field to given value.

### HasFlagged

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) HasFlagged() bool`

HasFlagged returns a boolean if a field has been set.

### GetHasautosavedstep

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetHasautosavedstep() bool`

GetHasautosavedstep returns the Hasautosavedstep field if non-nil, zero value otherwise.

### GetHasautosavedstepOk

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetHasautosavedstepOk() (*bool, bool)`

GetHasautosavedstepOk returns a tuple with the Hasautosavedstep field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasautosavedstep

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) SetHasautosavedstep(v bool)`

SetHasautosavedstep sets Hasautosavedstep field to given value.

### HasHasautosavedstep

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) HasHasautosavedstep() bool`

HasHasautosavedstep returns a boolean if a field has been set.

### GetHtml

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetHtml() string`

GetHtml returns the Html field if non-nil, zero value otherwise.

### GetHtmlOk

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetHtmlOk() (*string, bool)`

GetHtmlOk returns a tuple with the Html field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHtml

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) SetHtml(v string)`

SetHtml sets Html field to given value.

### HasHtml

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) HasHtml() bool`

HasHtml returns a boolean if a field has been set.

### GetLastactiontime

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetLastactiontime() int32`

GetLastactiontime returns the Lastactiontime field if non-nil, zero value otherwise.

### GetLastactiontimeOk

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetLastactiontimeOk() (*int32, bool)`

GetLastactiontimeOk returns a tuple with the Lastactiontime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastactiontime

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) SetLastactiontime(v int32)`

SetLastactiontime sets Lastactiontime field to given value.

### HasLastactiontime

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) HasLastactiontime() bool`

HasLastactiontime returns a boolean if a field has been set.

### GetMark

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetMark() string`

GetMark returns the Mark field if non-nil, zero value otherwise.

### GetMarkOk

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetMarkOk() (*string, bool)`

GetMarkOk returns a tuple with the Mark field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMark

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) SetMark(v string)`

SetMark sets Mark field to given value.

### HasMark

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) HasMark() bool`

HasMark returns a boolean if a field has been set.

### GetMaxmark

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetMaxmark() float32`

GetMaxmark returns the Maxmark field if non-nil, zero value otherwise.

### GetMaxmarkOk

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetMaxmarkOk() (*float32, bool)`

GetMaxmarkOk returns a tuple with the Maxmark field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxmark

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) SetMaxmark(v float32)`

SetMaxmark sets Maxmark field to given value.

### HasMaxmark

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) HasMaxmark() bool`

HasMaxmark returns a boolean if a field has been set.

### GetNumber

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetNumber() int32`

GetNumber returns the Number field if non-nil, zero value otherwise.

### GetNumberOk

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetNumberOk() (*int32, bool)`

GetNumberOk returns a tuple with the Number field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumber

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) SetNumber(v int32)`

SetNumber sets Number field to given value.

### HasNumber

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) HasNumber() bool`

HasNumber returns a boolean if a field has been set.

### GetPage

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) SetPage(v int32)`

SetPage sets Page field to given value.

### HasPage

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) HasPage() bool`

HasPage returns a boolean if a field has been set.

### GetQuestionnumber

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetQuestionnumber() string`

GetQuestionnumber returns the Questionnumber field if non-nil, zero value otherwise.

### GetQuestionnumberOk

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetQuestionnumberOk() (*string, bool)`

GetQuestionnumberOk returns a tuple with the Questionnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuestionnumber

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) SetQuestionnumber(v string)`

SetQuestionnumber sets Questionnumber field to given value.

### HasQuestionnumber

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) HasQuestionnumber() bool`

HasQuestionnumber returns a boolean if a field has been set.

### GetResponsefileareas

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetResponsefileareas() []ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner`

GetResponsefileareas returns the Responsefileareas field if non-nil, zero value otherwise.

### GetResponsefileareasOk

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetResponsefileareasOk() (*[]ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner, bool)`

GetResponsefileareasOk returns a tuple with the Responsefileareas field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponsefileareas

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) SetResponsefileareas(v []ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner)`

SetResponsefileareas sets Responsefileareas field to given value.

### HasResponsefileareas

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) HasResponsefileareas() bool`

HasResponsefileareas returns a boolean if a field has been set.

### GetSequencecheck

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetSequencecheck() int32`

GetSequencecheck returns the Sequencecheck field if non-nil, zero value otherwise.

### GetSequencecheckOk

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetSequencecheckOk() (*int32, bool)`

GetSequencecheckOk returns a tuple with the Sequencecheck field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSequencecheck

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) SetSequencecheck(v int32)`

SetSequencecheck sets Sequencecheck field to given value.

### HasSequencecheck

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) HasSequencecheck() bool`

HasSequencecheck returns a boolean if a field has been set.

### GetSettings

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetSettings() string`

GetSettings returns the Settings field if non-nil, zero value otherwise.

### GetSettingsOk

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetSettingsOk() (*string, bool)`

GetSettingsOk returns a tuple with the Settings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSettings

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) SetSettings(v string)`

SetSettings sets Settings field to given value.

### HasSettings

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) HasSettings() bool`

HasSettings returns a boolean if a field has been set.

### GetSlot

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetSlot() int32`

GetSlot returns the Slot field if non-nil, zero value otherwise.

### GetSlotOk

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetSlotOk() (*int32, bool)`

GetSlotOk returns a tuple with the Slot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSlot

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) SetSlot(v int32)`

SetSlot sets Slot field to given value.

### HasSlot

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) HasSlot() bool`

HasSlot returns a boolean if a field has been set.

### GetState

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetState() string`

GetState returns the State field if non-nil, zero value otherwise.

### GetStateOk

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetStateOk() (*string, bool)`

GetStateOk returns a tuple with the State field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetState

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) SetState(v string)`

SetState sets State field to given value.

### HasState

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) HasState() bool`

HasState returns a boolean if a field has been set.

### GetStatus

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetType

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *ModQuizGetAttemptReview200ResponseQuestionsInner) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


