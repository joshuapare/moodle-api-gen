# CoreBadgesGetUserBadges200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Badges** | [**[]CoreBadgesGetUserBadges200ResponseBadgesInner**](CoreBadgesGetUserBadges200ResponseBadgesInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreBadgesGetUserBadges200Response

`func NewCoreBadgesGetUserBadges200Response(badges []CoreBadgesGetUserBadges200ResponseBadgesInner, ) *CoreBadgesGetUserBadges200Response`

NewCoreBadgesGetUserBadges200Response instantiates a new CoreBadgesGetUserBadges200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreBadgesGetUserBadges200ResponseWithDefaults

`func NewCoreBadgesGetUserBadges200ResponseWithDefaults() *CoreBadgesGetUserBadges200Response`

NewCoreBadgesGetUserBadges200ResponseWithDefaults instantiates a new CoreBadgesGetUserBadges200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBadges

`func (o *CoreBadgesGetUserBadges200Response) GetBadges() []CoreBadgesGetUserBadges200ResponseBadgesInner`

GetBadges returns the Badges field if non-nil, zero value otherwise.

### GetBadgesOk

`func (o *CoreBadgesGetUserBadges200Response) GetBadgesOk() (*[]CoreBadgesGetUserBadges200ResponseBadgesInner, bool)`

GetBadgesOk returns a tuple with the Badges field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBadges

`func (o *CoreBadgesGetUserBadges200Response) SetBadges(v []CoreBadgesGetUserBadges200ResponseBadgesInner)`

SetBadges sets Badges field to given value.


### GetWarnings

`func (o *CoreBadgesGetUserBadges200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreBadgesGetUserBadges200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreBadgesGetUserBadges200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreBadgesGetUserBadges200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


