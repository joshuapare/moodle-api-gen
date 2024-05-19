# CoreBlockGetDashboardBlocksRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Mypage** | Pointer to **string** | What my page to return blocks of | [optional] [default to "__default"]
**Returncontents** | Pointer to **bool** | Whether to return the block contents. | [optional] [default to false]
**Userid** | Pointer to **int32** | User id (optional), default is current user. | [optional] [default to 0]

## Methods

### NewCoreBlockGetDashboardBlocksRequest

`func NewCoreBlockGetDashboardBlocksRequest() *CoreBlockGetDashboardBlocksRequest`

NewCoreBlockGetDashboardBlocksRequest instantiates a new CoreBlockGetDashboardBlocksRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreBlockGetDashboardBlocksRequestWithDefaults

`func NewCoreBlockGetDashboardBlocksRequestWithDefaults() *CoreBlockGetDashboardBlocksRequest`

NewCoreBlockGetDashboardBlocksRequestWithDefaults instantiates a new CoreBlockGetDashboardBlocksRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMypage

`func (o *CoreBlockGetDashboardBlocksRequest) GetMypage() string`

GetMypage returns the Mypage field if non-nil, zero value otherwise.

### GetMypageOk

`func (o *CoreBlockGetDashboardBlocksRequest) GetMypageOk() (*string, bool)`

GetMypageOk returns a tuple with the Mypage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMypage

`func (o *CoreBlockGetDashboardBlocksRequest) SetMypage(v string)`

SetMypage sets Mypage field to given value.

### HasMypage

`func (o *CoreBlockGetDashboardBlocksRequest) HasMypage() bool`

HasMypage returns a boolean if a field has been set.

### GetReturncontents

`func (o *CoreBlockGetDashboardBlocksRequest) GetReturncontents() bool`

GetReturncontents returns the Returncontents field if non-nil, zero value otherwise.

### GetReturncontentsOk

`func (o *CoreBlockGetDashboardBlocksRequest) GetReturncontentsOk() (*bool, bool)`

GetReturncontentsOk returns a tuple with the Returncontents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReturncontents

`func (o *CoreBlockGetDashboardBlocksRequest) SetReturncontents(v bool)`

SetReturncontents sets Returncontents field to given value.

### HasReturncontents

`func (o *CoreBlockGetDashboardBlocksRequest) HasReturncontents() bool`

HasReturncontents returns a boolean if a field has been set.

### GetUserid

`func (o *CoreBlockGetDashboardBlocksRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreBlockGetDashboardBlocksRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreBlockGetDashboardBlocksRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreBlockGetDashboardBlocksRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


