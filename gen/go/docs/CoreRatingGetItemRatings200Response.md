# CoreRatingGetItemRatings200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ratings** | [**[]CoreRatingGetItemRatings200ResponseRatingsInner**](CoreRatingGetItemRatings200ResponseRatingsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreRatingGetItemRatings200Response

`func NewCoreRatingGetItemRatings200Response(ratings []CoreRatingGetItemRatings200ResponseRatingsInner, ) *CoreRatingGetItemRatings200Response`

NewCoreRatingGetItemRatings200Response instantiates a new CoreRatingGetItemRatings200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreRatingGetItemRatings200ResponseWithDefaults

`func NewCoreRatingGetItemRatings200ResponseWithDefaults() *CoreRatingGetItemRatings200Response`

NewCoreRatingGetItemRatings200ResponseWithDefaults instantiates a new CoreRatingGetItemRatings200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRatings

`func (o *CoreRatingGetItemRatings200Response) GetRatings() []CoreRatingGetItemRatings200ResponseRatingsInner`

GetRatings returns the Ratings field if non-nil, zero value otherwise.

### GetRatingsOk

`func (o *CoreRatingGetItemRatings200Response) GetRatingsOk() (*[]CoreRatingGetItemRatings200ResponseRatingsInner, bool)`

GetRatingsOk returns a tuple with the Ratings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRatings

`func (o *CoreRatingGetItemRatings200Response) SetRatings(v []CoreRatingGetItemRatings200ResponseRatingsInner)`

SetRatings sets Ratings field to given value.


### GetWarnings

`func (o *CoreRatingGetItemRatings200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreRatingGetItemRatings200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreRatingGetItemRatings200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreRatingGetItemRatings200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


