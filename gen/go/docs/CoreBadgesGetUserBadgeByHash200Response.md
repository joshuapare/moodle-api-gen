# CoreBadgesGetUserBadgeByHash200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Badge** | [**[]CoreBadgesGetUserBadgeByHash200ResponseBadgeInner**](CoreBadgesGetUserBadgeByHash200ResponseBadgeInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreBadgesGetUserBadgeByHash200Response

`func NewCoreBadgesGetUserBadgeByHash200Response(badge []CoreBadgesGetUserBadgeByHash200ResponseBadgeInner, ) *CoreBadgesGetUserBadgeByHash200Response`

NewCoreBadgesGetUserBadgeByHash200Response instantiates a new CoreBadgesGetUserBadgeByHash200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreBadgesGetUserBadgeByHash200ResponseWithDefaults

`func NewCoreBadgesGetUserBadgeByHash200ResponseWithDefaults() *CoreBadgesGetUserBadgeByHash200Response`

NewCoreBadgesGetUserBadgeByHash200ResponseWithDefaults instantiates a new CoreBadgesGetUserBadgeByHash200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBadge

`func (o *CoreBadgesGetUserBadgeByHash200Response) GetBadge() []CoreBadgesGetUserBadgeByHash200ResponseBadgeInner`

GetBadge returns the Badge field if non-nil, zero value otherwise.

### GetBadgeOk

`func (o *CoreBadgesGetUserBadgeByHash200Response) GetBadgeOk() (*[]CoreBadgesGetUserBadgeByHash200ResponseBadgeInner, bool)`

GetBadgeOk returns a tuple with the Badge field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBadge

`func (o *CoreBadgesGetUserBadgeByHash200Response) SetBadge(v []CoreBadgesGetUserBadgeByHash200ResponseBadgeInner)`

SetBadge sets Badge field to given value.


### GetWarnings

`func (o *CoreBadgesGetUserBadgeByHash200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreBadgesGetUserBadgeByHash200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreBadgesGetUserBadgeByHash200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreBadgesGetUserBadgeByHash200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


