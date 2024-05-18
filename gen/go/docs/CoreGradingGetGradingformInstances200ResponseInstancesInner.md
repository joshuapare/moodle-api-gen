# CoreGradingGetGradingformInstances200ResponseInstancesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Feedback** | Pointer to **string** | feedback | [optional] [default to "null"]
**Feedbackformat** | Pointer to **int32** | feedback format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**Guide** | Pointer to [**CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide**](CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide.md) |  | [optional] 
**Id** | Pointer to **int32** | instance id | [optional] 
**Itemid** | Pointer to **int32** | item id | [optional] 
**Raterid** | Pointer to **int32** | rater id | [optional] [default to null]
**Rawgrade** | Pointer to **string** | raw grade | [optional] [default to "null"]
**Rubric** | Pointer to [**CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric**](CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric.md) |  | [optional] 
**Status** | Pointer to **int32** | status | [optional] 
**Timemodified** | Pointer to **int32** | modified time | [optional] [default to null]

## Methods

### NewCoreGradingGetGradingformInstances200ResponseInstancesInner

`func NewCoreGradingGetGradingformInstances200ResponseInstancesInner() *CoreGradingGetGradingformInstances200ResponseInstancesInner`

NewCoreGradingGetGradingformInstances200ResponseInstancesInner instantiates a new CoreGradingGetGradingformInstances200ResponseInstancesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradingGetGradingformInstances200ResponseInstancesInnerWithDefaults

`func NewCoreGradingGetGradingformInstances200ResponseInstancesInnerWithDefaults() *CoreGradingGetGradingformInstances200ResponseInstancesInner`

NewCoreGradingGetGradingformInstances200ResponseInstancesInnerWithDefaults instantiates a new CoreGradingGetGradingformInstances200ResponseInstancesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFeedback

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) GetFeedback() string`

GetFeedback returns the Feedback field if non-nil, zero value otherwise.

### GetFeedbackOk

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) GetFeedbackOk() (*string, bool)`

GetFeedbackOk returns a tuple with the Feedback field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedback

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) SetFeedback(v string)`

SetFeedback sets Feedback field to given value.

### HasFeedback

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) HasFeedback() bool`

HasFeedback returns a boolean if a field has been set.

### GetFeedbackformat

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) GetFeedbackformat() int32`

GetFeedbackformat returns the Feedbackformat field if non-nil, zero value otherwise.

### GetFeedbackformatOk

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) GetFeedbackformatOk() (*int32, bool)`

GetFeedbackformatOk returns a tuple with the Feedbackformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackformat

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) SetFeedbackformat(v int32)`

SetFeedbackformat sets Feedbackformat field to given value.

### HasFeedbackformat

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) HasFeedbackformat() bool`

HasFeedbackformat returns a boolean if a field has been set.

### GetGuide

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) GetGuide() CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide`

GetGuide returns the Guide field if non-nil, zero value otherwise.

### GetGuideOk

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) GetGuideOk() (*CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide, bool)`

GetGuideOk returns a tuple with the Guide field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGuide

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) SetGuide(v CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide)`

SetGuide sets Guide field to given value.

### HasGuide

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) HasGuide() bool`

HasGuide returns a boolean if a field has been set.

### GetId

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetItemid

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) GetItemid() int32`

GetItemid returns the Itemid field if non-nil, zero value otherwise.

### GetItemidOk

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) GetItemidOk() (*int32, bool)`

GetItemidOk returns a tuple with the Itemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemid

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) SetItemid(v int32)`

SetItemid sets Itemid field to given value.

### HasItemid

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) HasItemid() bool`

HasItemid returns a boolean if a field has been set.

### GetRaterid

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) GetRaterid() int32`

GetRaterid returns the Raterid field if non-nil, zero value otherwise.

### GetRateridOk

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) GetRateridOk() (*int32, bool)`

GetRateridOk returns a tuple with the Raterid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRaterid

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) SetRaterid(v int32)`

SetRaterid sets Raterid field to given value.

### HasRaterid

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) HasRaterid() bool`

HasRaterid returns a boolean if a field has been set.

### GetRawgrade

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) GetRawgrade() string`

GetRawgrade returns the Rawgrade field if non-nil, zero value otherwise.

### GetRawgradeOk

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) GetRawgradeOk() (*string, bool)`

GetRawgradeOk returns a tuple with the Rawgrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRawgrade

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) SetRawgrade(v string)`

SetRawgrade sets Rawgrade field to given value.

### HasRawgrade

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) HasRawgrade() bool`

HasRawgrade returns a boolean if a field has been set.

### GetRubric

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) GetRubric() CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric`

GetRubric returns the Rubric field if non-nil, zero value otherwise.

### GetRubricOk

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) GetRubricOk() (*CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric, bool)`

GetRubricOk returns a tuple with the Rubric field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRubric

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) SetRubric(v CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric)`

SetRubric sets Rubric field to given value.

### HasRubric

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) HasRubric() bool`

HasRubric returns a boolean if a field has been set.

### GetStatus

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) GetStatus() int32`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) GetStatusOk() (*int32, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) SetStatus(v int32)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTimemodified

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *CoreGradingGetGradingformInstances200ResponseInstancesInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


