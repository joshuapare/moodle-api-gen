# ModChoiceGetChoiceResults200ResponseOptionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** | choice instance id | [optional] 
**Maxanswer** | Pointer to **int32** | maximum number of answers | [optional] 
**Numberofuser** | Pointer to **int32** | number of users answers | [optional] [default to null]
**Percentageamount** | Pointer to **float32** | percentage of users answers | [optional] [default to null]
**Text** | Pointer to **string** | text of the choice | [optional] 
**Userresponses** | Pointer to [**[]ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner**](ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner.md) |  | [optional] 

## Methods

### NewModChoiceGetChoiceResults200ResponseOptionsInner

`func NewModChoiceGetChoiceResults200ResponseOptionsInner() *ModChoiceGetChoiceResults200ResponseOptionsInner`

NewModChoiceGetChoiceResults200ResponseOptionsInner instantiates a new ModChoiceGetChoiceResults200ResponseOptionsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModChoiceGetChoiceResults200ResponseOptionsInnerWithDefaults

`func NewModChoiceGetChoiceResults200ResponseOptionsInnerWithDefaults() *ModChoiceGetChoiceResults200ResponseOptionsInner`

NewModChoiceGetChoiceResults200ResponseOptionsInnerWithDefaults instantiates a new ModChoiceGetChoiceResults200ResponseOptionsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ModChoiceGetChoiceResults200ResponseOptionsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModChoiceGetChoiceResults200ResponseOptionsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModChoiceGetChoiceResults200ResponseOptionsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModChoiceGetChoiceResults200ResponseOptionsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetMaxanswer

`func (o *ModChoiceGetChoiceResults200ResponseOptionsInner) GetMaxanswer() int32`

GetMaxanswer returns the Maxanswer field if non-nil, zero value otherwise.

### GetMaxanswerOk

`func (o *ModChoiceGetChoiceResults200ResponseOptionsInner) GetMaxanswerOk() (*int32, bool)`

GetMaxanswerOk returns a tuple with the Maxanswer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxanswer

`func (o *ModChoiceGetChoiceResults200ResponseOptionsInner) SetMaxanswer(v int32)`

SetMaxanswer sets Maxanswer field to given value.

### HasMaxanswer

`func (o *ModChoiceGetChoiceResults200ResponseOptionsInner) HasMaxanswer() bool`

HasMaxanswer returns a boolean if a field has been set.

### GetNumberofuser

`func (o *ModChoiceGetChoiceResults200ResponseOptionsInner) GetNumberofuser() int32`

GetNumberofuser returns the Numberofuser field if non-nil, zero value otherwise.

### GetNumberofuserOk

`func (o *ModChoiceGetChoiceResults200ResponseOptionsInner) GetNumberofuserOk() (*int32, bool)`

GetNumberofuserOk returns a tuple with the Numberofuser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumberofuser

`func (o *ModChoiceGetChoiceResults200ResponseOptionsInner) SetNumberofuser(v int32)`

SetNumberofuser sets Numberofuser field to given value.

### HasNumberofuser

`func (o *ModChoiceGetChoiceResults200ResponseOptionsInner) HasNumberofuser() bool`

HasNumberofuser returns a boolean if a field has been set.

### GetPercentageamount

`func (o *ModChoiceGetChoiceResults200ResponseOptionsInner) GetPercentageamount() float32`

GetPercentageamount returns the Percentageamount field if non-nil, zero value otherwise.

### GetPercentageamountOk

`func (o *ModChoiceGetChoiceResults200ResponseOptionsInner) GetPercentageamountOk() (*float32, bool)`

GetPercentageamountOk returns a tuple with the Percentageamount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPercentageamount

`func (o *ModChoiceGetChoiceResults200ResponseOptionsInner) SetPercentageamount(v float32)`

SetPercentageamount sets Percentageamount field to given value.

### HasPercentageamount

`func (o *ModChoiceGetChoiceResults200ResponseOptionsInner) HasPercentageamount() bool`

HasPercentageamount returns a boolean if a field has been set.

### GetText

`func (o *ModChoiceGetChoiceResults200ResponseOptionsInner) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *ModChoiceGetChoiceResults200ResponseOptionsInner) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *ModChoiceGetChoiceResults200ResponseOptionsInner) SetText(v string)`

SetText sets Text field to given value.

### HasText

`func (o *ModChoiceGetChoiceResults200ResponseOptionsInner) HasText() bool`

HasText returns a boolean if a field has been set.

### GetUserresponses

`func (o *ModChoiceGetChoiceResults200ResponseOptionsInner) GetUserresponses() []ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner`

GetUserresponses returns the Userresponses field if non-nil, zero value otherwise.

### GetUserresponsesOk

`func (o *ModChoiceGetChoiceResults200ResponseOptionsInner) GetUserresponsesOk() (*[]ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner, bool)`

GetUserresponsesOk returns a tuple with the Userresponses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserresponses

`func (o *ModChoiceGetChoiceResults200ResponseOptionsInner) SetUserresponses(v []ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner)`

SetUserresponses sets Userresponses field to given value.

### HasUserresponses

`func (o *ModChoiceGetChoiceResults200ResponseOptionsInner) HasUserresponses() bool`

HasUserresponses returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


