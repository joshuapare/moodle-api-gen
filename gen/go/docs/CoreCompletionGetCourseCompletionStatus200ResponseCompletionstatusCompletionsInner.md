# CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Complete** | Pointer to **bool** | Completion status (true/false) | [optional] [default to null]
**Details** | Pointer to [**CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails**](CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails.md) |  | [optional] 
**Status** | Pointer to **string** | Completion status (Yes/No) a % or number | [optional] [default to "null"]
**Timecompleted** | Pointer to **int32** | Timestamp for criteria completetion | [optional] [default to null]
**Title** | Pointer to **string** | Completion criteria Title | [optional] [default to "null"]
**Type** | Pointer to **int32** | Completion criteria type | [optional] [default to null]

## Methods

### NewCoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner

`func NewCoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner() *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner`

NewCoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner instantiates a new CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerWithDefaults

`func NewCoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerWithDefaults() *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner`

NewCoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerWithDefaults instantiates a new CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComplete

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner) GetComplete() bool`

GetComplete returns the Complete field if non-nil, zero value otherwise.

### GetCompleteOk

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner) GetCompleteOk() (*bool, bool)`

GetCompleteOk returns a tuple with the Complete field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComplete

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner) SetComplete(v bool)`

SetComplete sets Complete field to given value.

### HasComplete

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner) HasComplete() bool`

HasComplete returns a boolean if a field has been set.

### GetDetails

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner) GetDetails() CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails`

GetDetails returns the Details field if non-nil, zero value otherwise.

### GetDetailsOk

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner) GetDetailsOk() (*CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails, bool)`

GetDetailsOk returns a tuple with the Details field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDetails

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner) SetDetails(v CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails)`

SetDetails sets Details field to given value.

### HasDetails

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner) HasDetails() bool`

HasDetails returns a boolean if a field has been set.

### GetStatus

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTimecompleted

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner) GetTimecompleted() int32`

GetTimecompleted returns the Timecompleted field if non-nil, zero value otherwise.

### GetTimecompletedOk

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner) GetTimecompletedOk() (*int32, bool)`

GetTimecompletedOk returns a tuple with the Timecompleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecompleted

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner) SetTimecompleted(v int32)`

SetTimecompleted sets Timecompleted field to given value.

### HasTimecompleted

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner) HasTimecompleted() bool`

HasTimecompleted returns a boolean if a field has been set.

### GetTitle

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### GetType

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner) GetType() int32`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner) GetTypeOk() (*int32, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner) SetType(v int32)`

SetType sets Type field to given value.

### HasType

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


