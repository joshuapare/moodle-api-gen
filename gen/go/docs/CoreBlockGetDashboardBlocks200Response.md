# CoreBlockGetDashboardBlocks200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Blocks** | [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreBlockGetDashboardBlocks200Response

`func NewCoreBlockGetDashboardBlocks200Response(blocks []CoreBlockGetDashboardBlocks200ResponseBlocksInner, ) *CoreBlockGetDashboardBlocks200Response`

NewCoreBlockGetDashboardBlocks200Response instantiates a new CoreBlockGetDashboardBlocks200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreBlockGetDashboardBlocks200ResponseWithDefaults

`func NewCoreBlockGetDashboardBlocks200ResponseWithDefaults() *CoreBlockGetDashboardBlocks200Response`

NewCoreBlockGetDashboardBlocks200ResponseWithDefaults instantiates a new CoreBlockGetDashboardBlocks200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBlocks

`func (o *CoreBlockGetDashboardBlocks200Response) GetBlocks() []CoreBlockGetDashboardBlocks200ResponseBlocksInner`

GetBlocks returns the Blocks field if non-nil, zero value otherwise.

### GetBlocksOk

`func (o *CoreBlockGetDashboardBlocks200Response) GetBlocksOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInner, bool)`

GetBlocksOk returns a tuple with the Blocks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlocks

`func (o *CoreBlockGetDashboardBlocks200Response) SetBlocks(v []CoreBlockGetDashboardBlocks200ResponseBlocksInner)`

SetBlocks sets Blocks field to given value.


### GetWarnings

`func (o *CoreBlockGetDashboardBlocks200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreBlockGetDashboardBlocks200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreBlockGetDashboardBlocks200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreBlockGetDashboardBlocks200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


