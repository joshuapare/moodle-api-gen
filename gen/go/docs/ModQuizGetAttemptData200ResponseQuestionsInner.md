# ModQuizGetAttemptData200ResponseQuestionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Blockedbyprevious** | Pointer to **bool** | whether the question is blocked by the previous question | [optional] [default to null]
**Flagged** | Pointer to **bool** | whether the question is flagged or not | [optional] [default to null]
**Hasautosavedstep** | Pointer to **bool** | whether this question attempt has autosaved data | [optional] [default to null]
**Html** | Pointer to **string** | the question rendered | [optional] [default to "null"]
**Lastactiontime** | Pointer to **int32** | the timestamp of the most recent step in this question attempt | [optional] [default to null]
**Mark** | Pointer to **string** | the mark awarded.                     It will be returned only if the user is allowed to see it. | [optional] [default to "null"]
**Maxmark** | Pointer to **float32** | the maximum mark possible for this question attempt.                     It will be returned only if the user is allowed to see it. | [optional] [default to null]
**Number** | Pointer to **int32** | DO NOT USE. Use questionnumber. Only retained for backwards compatibility. | [optional] [default to null]
**Page** | Pointer to **int32** | page of the quiz this question appears on | [optional] [default to null]
**Questionnumber** | Pointer to **string** | The question number to display for this question, e.g. \&quot;7\&quot;, \&quot;i\&quot; or \&quot;Custom-B)\&quot;. | [optional] [default to "null"]
**Responsefileareas** | Pointer to [**[]ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner**](ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner.md) |  | [optional] 
**Sequencecheck** | Pointer to **int32** | the number of real steps in this attempt | [optional] [default to null]
**Settings** | Pointer to **string** | Question settings (JSON encoded). | [optional] [default to "null"]
**Slot** | Pointer to **int32** | slot number | [optional] [default to null]
**State** | Pointer to **string** | the state where the question is in.                     It will not be returned if the user cannot see it due to the quiz display correctness settings. | [optional] [default to "null"]
**Status** | Pointer to **string** | current formatted state of the question | [optional] [default to "null"]
**Type** | Pointer to **string** | question type, i.e: multichoice | [optional] [default to "null"]

## Methods

### NewModQuizGetAttemptData200ResponseQuestionsInner

`func NewModQuizGetAttemptData200ResponseQuestionsInner() *ModQuizGetAttemptData200ResponseQuestionsInner`

NewModQuizGetAttemptData200ResponseQuestionsInner instantiates a new ModQuizGetAttemptData200ResponseQuestionsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizGetAttemptData200ResponseQuestionsInnerWithDefaults

`func NewModQuizGetAttemptData200ResponseQuestionsInnerWithDefaults() *ModQuizGetAttemptData200ResponseQuestionsInner`

NewModQuizGetAttemptData200ResponseQuestionsInnerWithDefaults instantiates a new ModQuizGetAttemptData200ResponseQuestionsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBlockedbyprevious

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetBlockedbyprevious() bool`

GetBlockedbyprevious returns the Blockedbyprevious field if non-nil, zero value otherwise.

### GetBlockedbypreviousOk

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetBlockedbypreviousOk() (*bool, bool)`

GetBlockedbypreviousOk returns a tuple with the Blockedbyprevious field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlockedbyprevious

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) SetBlockedbyprevious(v bool)`

SetBlockedbyprevious sets Blockedbyprevious field to given value.

### HasBlockedbyprevious

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) HasBlockedbyprevious() bool`

HasBlockedbyprevious returns a boolean if a field has been set.

### GetFlagged

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetFlagged() bool`

GetFlagged returns the Flagged field if non-nil, zero value otherwise.

### GetFlaggedOk

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetFlaggedOk() (*bool, bool)`

GetFlaggedOk returns a tuple with the Flagged field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlagged

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) SetFlagged(v bool)`

SetFlagged sets Flagged field to given value.

### HasFlagged

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) HasFlagged() bool`

HasFlagged returns a boolean if a field has been set.

### GetHasautosavedstep

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetHasautosavedstep() bool`

GetHasautosavedstep returns the Hasautosavedstep field if non-nil, zero value otherwise.

### GetHasautosavedstepOk

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetHasautosavedstepOk() (*bool, bool)`

GetHasautosavedstepOk returns a tuple with the Hasautosavedstep field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasautosavedstep

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) SetHasautosavedstep(v bool)`

SetHasautosavedstep sets Hasautosavedstep field to given value.

### HasHasautosavedstep

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) HasHasautosavedstep() bool`

HasHasautosavedstep returns a boolean if a field has been set.

### GetHtml

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetHtml() string`

GetHtml returns the Html field if non-nil, zero value otherwise.

### GetHtmlOk

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetHtmlOk() (*string, bool)`

GetHtmlOk returns a tuple with the Html field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHtml

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) SetHtml(v string)`

SetHtml sets Html field to given value.

### HasHtml

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) HasHtml() bool`

HasHtml returns a boolean if a field has been set.

### GetLastactiontime

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetLastactiontime() int32`

GetLastactiontime returns the Lastactiontime field if non-nil, zero value otherwise.

### GetLastactiontimeOk

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetLastactiontimeOk() (*int32, bool)`

GetLastactiontimeOk returns a tuple with the Lastactiontime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastactiontime

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) SetLastactiontime(v int32)`

SetLastactiontime sets Lastactiontime field to given value.

### HasLastactiontime

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) HasLastactiontime() bool`

HasLastactiontime returns a boolean if a field has been set.

### GetMark

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetMark() string`

GetMark returns the Mark field if non-nil, zero value otherwise.

### GetMarkOk

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetMarkOk() (*string, bool)`

GetMarkOk returns a tuple with the Mark field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMark

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) SetMark(v string)`

SetMark sets Mark field to given value.

### HasMark

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) HasMark() bool`

HasMark returns a boolean if a field has been set.

### GetMaxmark

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetMaxmark() float32`

GetMaxmark returns the Maxmark field if non-nil, zero value otherwise.

### GetMaxmarkOk

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetMaxmarkOk() (*float32, bool)`

GetMaxmarkOk returns a tuple with the Maxmark field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxmark

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) SetMaxmark(v float32)`

SetMaxmark sets Maxmark field to given value.

### HasMaxmark

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) HasMaxmark() bool`

HasMaxmark returns a boolean if a field has been set.

### GetNumber

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetNumber() int32`

GetNumber returns the Number field if non-nil, zero value otherwise.

### GetNumberOk

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetNumberOk() (*int32, bool)`

GetNumberOk returns a tuple with the Number field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumber

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) SetNumber(v int32)`

SetNumber sets Number field to given value.

### HasNumber

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) HasNumber() bool`

HasNumber returns a boolean if a field has been set.

### GetPage

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) SetPage(v int32)`

SetPage sets Page field to given value.

### HasPage

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) HasPage() bool`

HasPage returns a boolean if a field has been set.

### GetQuestionnumber

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetQuestionnumber() string`

GetQuestionnumber returns the Questionnumber field if non-nil, zero value otherwise.

### GetQuestionnumberOk

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetQuestionnumberOk() (*string, bool)`

GetQuestionnumberOk returns a tuple with the Questionnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuestionnumber

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) SetQuestionnumber(v string)`

SetQuestionnumber sets Questionnumber field to given value.

### HasQuestionnumber

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) HasQuestionnumber() bool`

HasQuestionnumber returns a boolean if a field has been set.

### GetResponsefileareas

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetResponsefileareas() []ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner`

GetResponsefileareas returns the Responsefileareas field if non-nil, zero value otherwise.

### GetResponsefileareasOk

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetResponsefileareasOk() (*[]ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner, bool)`

GetResponsefileareasOk returns a tuple with the Responsefileareas field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponsefileareas

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) SetResponsefileareas(v []ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner)`

SetResponsefileareas sets Responsefileareas field to given value.

### HasResponsefileareas

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) HasResponsefileareas() bool`

HasResponsefileareas returns a boolean if a field has been set.

### GetSequencecheck

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetSequencecheck() int32`

GetSequencecheck returns the Sequencecheck field if non-nil, zero value otherwise.

### GetSequencecheckOk

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetSequencecheckOk() (*int32, bool)`

GetSequencecheckOk returns a tuple with the Sequencecheck field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSequencecheck

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) SetSequencecheck(v int32)`

SetSequencecheck sets Sequencecheck field to given value.

### HasSequencecheck

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) HasSequencecheck() bool`

HasSequencecheck returns a boolean if a field has been set.

### GetSettings

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetSettings() string`

GetSettings returns the Settings field if non-nil, zero value otherwise.

### GetSettingsOk

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetSettingsOk() (*string, bool)`

GetSettingsOk returns a tuple with the Settings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSettings

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) SetSettings(v string)`

SetSettings sets Settings field to given value.

### HasSettings

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) HasSettings() bool`

HasSettings returns a boolean if a field has been set.

### GetSlot

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetSlot() int32`

GetSlot returns the Slot field if non-nil, zero value otherwise.

### GetSlotOk

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetSlotOk() (*int32, bool)`

GetSlotOk returns a tuple with the Slot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSlot

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) SetSlot(v int32)`

SetSlot sets Slot field to given value.

### HasSlot

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) HasSlot() bool`

HasSlot returns a boolean if a field has been set.

### GetState

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetState() string`

GetState returns the State field if non-nil, zero value otherwise.

### GetStateOk

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetStateOk() (*string, bool)`

GetStateOk returns a tuple with the State field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetState

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) SetState(v string)`

SetState sets State field to given value.

### HasState

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) HasState() bool`

HasState returns a boolean if a field has been set.

### GetStatus

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetType

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *ModQuizGetAttemptData200ResponseQuestionsInner) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


