# ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Answerlabel** | Pointer to **string** | Label used for user answers | [optional] [default to "null"]
**Attemptid** | Pointer to **int32** | ID of the H5P attempt | [optional] [default to null]
**Completion** | Pointer to **int32** | Result completion | [optional] [default to null]
**Content** | Pointer to **string** | Result extra content | [optional] [default to "null"]
**Correctlabel** | Pointer to **string** | Label used for correct answers | [optional] [default to "null"]
**Description** | Pointer to **string** | Result description | [optional] [default to "null"]
**Duration** | Pointer to **int32** | Result duration in seconds | [optional] [default to 0]
**Id** | Pointer to **int32** | ID of the context | [optional] 
**Interactiontype** | Pointer to **string** | Interaction type | [optional] [default to "null"]
**Maxscore** | Pointer to **int32** | Result max score | [optional] [default to null]
**Options** | Pointer to [**[]ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner**](ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner.md) |  | [optional] 
**Optionslabel** | Pointer to **string** | Label used for result options | [optional] [default to "null"]
**Rawscore** | Pointer to **int32** | Result score value | [optional] [default to null]
**Subcontent** | Pointer to **string** | Subcontent identifier | [optional] [default to "null"]
**Success** | Pointer to **int32** | Result success | [optional] [default to null]
**Timecreated** | Pointer to **int32** | Result creation | [optional] [default to null]
**Track** | Pointer to **bool** | If the result has valid track information | [optional] [default to null]

## Methods

### NewModH5pactivityGetResults200ResponseAttemptsInnerResultsInner

`func NewModH5pactivityGetResults200ResponseAttemptsInnerResultsInner() *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner`

NewModH5pactivityGetResults200ResponseAttemptsInnerResultsInner instantiates a new ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerWithDefaults

`func NewModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerWithDefaults() *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner`

NewModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerWithDefaults instantiates a new ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAnswerlabel

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetAnswerlabel() string`

GetAnswerlabel returns the Answerlabel field if non-nil, zero value otherwise.

### GetAnswerlabelOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetAnswerlabelOk() (*string, bool)`

GetAnswerlabelOk returns a tuple with the Answerlabel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAnswerlabel

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) SetAnswerlabel(v string)`

SetAnswerlabel sets Answerlabel field to given value.

### HasAnswerlabel

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) HasAnswerlabel() bool`

HasAnswerlabel returns a boolean if a field has been set.

### GetAttemptid

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetAttemptid() int32`

GetAttemptid returns the Attemptid field if non-nil, zero value otherwise.

### GetAttemptidOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetAttemptidOk() (*int32, bool)`

GetAttemptidOk returns a tuple with the Attemptid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttemptid

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) SetAttemptid(v int32)`

SetAttemptid sets Attemptid field to given value.

### HasAttemptid

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) HasAttemptid() bool`

HasAttemptid returns a boolean if a field has been set.

### GetCompletion

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetCompletion() int32`

GetCompletion returns the Completion field if non-nil, zero value otherwise.

### GetCompletionOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetCompletionOk() (*int32, bool)`

GetCompletionOk returns a tuple with the Completion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletion

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) SetCompletion(v int32)`

SetCompletion sets Completion field to given value.

### HasCompletion

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) HasCompletion() bool`

HasCompletion returns a boolean if a field has been set.

### GetContent

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) SetContent(v string)`

SetContent sets Content field to given value.

### HasContent

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) HasContent() bool`

HasContent returns a boolean if a field has been set.

### GetCorrectlabel

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetCorrectlabel() string`

GetCorrectlabel returns the Correctlabel field if non-nil, zero value otherwise.

### GetCorrectlabelOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetCorrectlabelOk() (*string, bool)`

GetCorrectlabelOk returns a tuple with the Correctlabel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCorrectlabel

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) SetCorrectlabel(v string)`

SetCorrectlabel sets Correctlabel field to given value.

### HasCorrectlabel

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) HasCorrectlabel() bool`

HasCorrectlabel returns a boolean if a field has been set.

### GetDescription

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDuration

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetDuration() int32`

GetDuration returns the Duration field if non-nil, zero value otherwise.

### GetDurationOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetDurationOk() (*int32, bool)`

GetDurationOk returns a tuple with the Duration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuration

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) SetDuration(v int32)`

SetDuration sets Duration field to given value.

### HasDuration

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) HasDuration() bool`

HasDuration returns a boolean if a field has been set.

### GetId

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetInteractiontype

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetInteractiontype() string`

GetInteractiontype returns the Interactiontype field if non-nil, zero value otherwise.

### GetInteractiontypeOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetInteractiontypeOk() (*string, bool)`

GetInteractiontypeOk returns a tuple with the Interactiontype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInteractiontype

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) SetInteractiontype(v string)`

SetInteractiontype sets Interactiontype field to given value.

### HasInteractiontype

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) HasInteractiontype() bool`

HasInteractiontype returns a boolean if a field has been set.

### GetMaxscore

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetMaxscore() int32`

GetMaxscore returns the Maxscore field if non-nil, zero value otherwise.

### GetMaxscoreOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetMaxscoreOk() (*int32, bool)`

GetMaxscoreOk returns a tuple with the Maxscore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxscore

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) SetMaxscore(v int32)`

SetMaxscore sets Maxscore field to given value.

### HasMaxscore

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) HasMaxscore() bool`

HasMaxscore returns a boolean if a field has been set.

### GetOptions

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetOptions() []ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetOptionsOk() (*[]ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) SetOptions(v []ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) HasOptions() bool`

HasOptions returns a boolean if a field has been set.

### GetOptionslabel

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetOptionslabel() string`

GetOptionslabel returns the Optionslabel field if non-nil, zero value otherwise.

### GetOptionslabelOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetOptionslabelOk() (*string, bool)`

GetOptionslabelOk returns a tuple with the Optionslabel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptionslabel

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) SetOptionslabel(v string)`

SetOptionslabel sets Optionslabel field to given value.

### HasOptionslabel

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) HasOptionslabel() bool`

HasOptionslabel returns a boolean if a field has been set.

### GetRawscore

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetRawscore() int32`

GetRawscore returns the Rawscore field if non-nil, zero value otherwise.

### GetRawscoreOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetRawscoreOk() (*int32, bool)`

GetRawscoreOk returns a tuple with the Rawscore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRawscore

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) SetRawscore(v int32)`

SetRawscore sets Rawscore field to given value.

### HasRawscore

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) HasRawscore() bool`

HasRawscore returns a boolean if a field has been set.

### GetSubcontent

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetSubcontent() string`

GetSubcontent returns the Subcontent field if non-nil, zero value otherwise.

### GetSubcontentOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetSubcontentOk() (*string, bool)`

GetSubcontentOk returns a tuple with the Subcontent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubcontent

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) SetSubcontent(v string)`

SetSubcontent sets Subcontent field to given value.

### HasSubcontent

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) HasSubcontent() bool`

HasSubcontent returns a boolean if a field has been set.

### GetSuccess

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetSuccess() int32`

GetSuccess returns the Success field if non-nil, zero value otherwise.

### GetSuccessOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetSuccessOk() (*int32, bool)`

GetSuccessOk returns a tuple with the Success field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuccess

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) SetSuccess(v int32)`

SetSuccess sets Success field to given value.

### HasSuccess

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) HasSuccess() bool`

HasSuccess returns a boolean if a field has been set.

### GetTimecreated

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTrack

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetTrack() bool`

GetTrack returns the Track field if non-nil, zero value otherwise.

### GetTrackOk

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) GetTrackOk() (*bool, bool)`

GetTrackOk returns a tuple with the Track field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrack

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) SetTrack(v bool)`

SetTrack sets Track field to given value.

### HasTrack

`func (o *ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner) HasTrack() bool`

HasTrack returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


