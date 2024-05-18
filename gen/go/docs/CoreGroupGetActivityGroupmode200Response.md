# CoreGroupGetActivityGroupmode200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Groupmode** | **int32** | group mode:                                                     0 for no groups, 1 for separate groups, 2 for visible groups | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreGroupGetActivityGroupmode200Response

`func NewCoreGroupGetActivityGroupmode200Response(groupmode int32, ) *CoreGroupGetActivityGroupmode200Response`

NewCoreGroupGetActivityGroupmode200Response instantiates a new CoreGroupGetActivityGroupmode200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGroupGetActivityGroupmode200ResponseWithDefaults

`func NewCoreGroupGetActivityGroupmode200ResponseWithDefaults() *CoreGroupGetActivityGroupmode200Response`

NewCoreGroupGetActivityGroupmode200ResponseWithDefaults instantiates a new CoreGroupGetActivityGroupmode200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGroupmode

`func (o *CoreGroupGetActivityGroupmode200Response) GetGroupmode() int32`

GetGroupmode returns the Groupmode field if non-nil, zero value otherwise.

### GetGroupmodeOk

`func (o *CoreGroupGetActivityGroupmode200Response) GetGroupmodeOk() (*int32, bool)`

GetGroupmodeOk returns a tuple with the Groupmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmode

`func (o *CoreGroupGetActivityGroupmode200Response) SetGroupmode(v int32)`

SetGroupmode sets Groupmode field to given value.


### GetWarnings

`func (o *CoreGroupGetActivityGroupmode200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreGroupGetActivityGroupmode200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreGroupGetActivityGroupmode200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreGroupGetActivityGroupmode200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


