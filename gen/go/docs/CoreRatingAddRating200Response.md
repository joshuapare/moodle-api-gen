# CoreRatingAddRating200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Aggregate** | Pointer to **string** | New aggregate | [optional] [default to "null"]
**Count** | Pointer to **int32** | Ratings count | [optional] [default to null]
**Itemid** | Pointer to **int32** | Rating item id | [optional] [default to null]
**Success** | **bool** | Whether the rate was successfully created | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreRatingAddRating200Response

`func NewCoreRatingAddRating200Response(success bool, ) *CoreRatingAddRating200Response`

NewCoreRatingAddRating200Response instantiates a new CoreRatingAddRating200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreRatingAddRating200ResponseWithDefaults

`func NewCoreRatingAddRating200ResponseWithDefaults() *CoreRatingAddRating200Response`

NewCoreRatingAddRating200ResponseWithDefaults instantiates a new CoreRatingAddRating200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAggregate

`func (o *CoreRatingAddRating200Response) GetAggregate() string`

GetAggregate returns the Aggregate field if non-nil, zero value otherwise.

### GetAggregateOk

`func (o *CoreRatingAddRating200Response) GetAggregateOk() (*string, bool)`

GetAggregateOk returns a tuple with the Aggregate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAggregate

`func (o *CoreRatingAddRating200Response) SetAggregate(v string)`

SetAggregate sets Aggregate field to given value.

### HasAggregate

`func (o *CoreRatingAddRating200Response) HasAggregate() bool`

HasAggregate returns a boolean if a field has been set.

### GetCount

`func (o *CoreRatingAddRating200Response) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *CoreRatingAddRating200Response) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *CoreRatingAddRating200Response) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *CoreRatingAddRating200Response) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetItemid

`func (o *CoreRatingAddRating200Response) GetItemid() int32`

GetItemid returns the Itemid field if non-nil, zero value otherwise.

### GetItemidOk

`func (o *CoreRatingAddRating200Response) GetItemidOk() (*int32, bool)`

GetItemidOk returns a tuple with the Itemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemid

`func (o *CoreRatingAddRating200Response) SetItemid(v int32)`

SetItemid sets Itemid field to given value.

### HasItemid

`func (o *CoreRatingAddRating200Response) HasItemid() bool`

HasItemid returns a boolean if a field has been set.

### GetSuccess

`func (o *CoreRatingAddRating200Response) GetSuccess() bool`

GetSuccess returns the Success field if non-nil, zero value otherwise.

### GetSuccessOk

`func (o *CoreRatingAddRating200Response) GetSuccessOk() (*bool, bool)`

GetSuccessOk returns a tuple with the Success field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuccess

`func (o *CoreRatingAddRating200Response) SetSuccess(v bool)`

SetSuccess sets Success field to given value.


### GetWarnings

`func (o *CoreRatingAddRating200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreRatingAddRating200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreRatingAddRating200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreRatingAddRating200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


