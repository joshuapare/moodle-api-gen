# \ModLessonApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mod_lesson_finish_attempt**](ModLessonApi.md#mod_lesson_finish_attempt) | **POST** /mod_lesson_finish_attempt | Finishes the current attempt.
[**mod_lesson_get_attempts_overview**](ModLessonApi.md#mod_lesson_get_attempts_overview) | **POST** /mod_lesson_get_attempts_overview | Get a list of all the attempts made by users in a lesson.
[**mod_lesson_get_content_pages_viewed**](ModLessonApi.md#mod_lesson_get_content_pages_viewed) | **POST** /mod_lesson_get_content_pages_viewed | Return the list of content pages viewed by a user during a lesson attempt.
[**mod_lesson_get_lesson**](ModLessonApi.md#mod_lesson_get_lesson) | **POST** /mod_lesson_get_lesson | Return information of a given lesson.
[**mod_lesson_get_lesson_access_information**](ModLessonApi.md#mod_lesson_get_lesson_access_information) | **POST** /mod_lesson_get_lesson_access_information | Return access information for a given lesson.
[**mod_lesson_get_lessons_by_courses**](ModLessonApi.md#mod_lesson_get_lessons_by_courses) | **POST** /mod_lesson_get_lessons_by_courses | Returns a list of lessons in a provided list of courses,                             if no list is provided all lessons that the user can view will be returned.
[**mod_lesson_get_page_data**](ModLessonApi.md#mod_lesson_get_page_data) | **POST** /mod_lesson_get_page_data | Return information of a given page, including its contents.
[**mod_lesson_get_pages**](ModLessonApi.md#mod_lesson_get_pages) | **POST** /mod_lesson_get_pages | Return the list of pages in a lesson (based on the user permissions).
[**mod_lesson_get_pages_possible_jumps**](ModLessonApi.md#mod_lesson_get_pages_possible_jumps) | **POST** /mod_lesson_get_pages_possible_jumps | Return all the possible jumps for the pages in a given lesson.
[**mod_lesson_get_questions_attempts**](ModLessonApi.md#mod_lesson_get_questions_attempts) | **POST** /mod_lesson_get_questions_attempts | Return the list of questions attempts in a given lesson.
[**mod_lesson_get_user_attempt**](ModLessonApi.md#mod_lesson_get_user_attempt) | **POST** /mod_lesson_get_user_attempt | Return information about the given user attempt (including answers).
[**mod_lesson_get_user_attempt_grade**](ModLessonApi.md#mod_lesson_get_user_attempt_grade) | **POST** /mod_lesson_get_user_attempt_grade | Return grade information in the attempt for a given user.
[**mod_lesson_get_user_grade**](ModLessonApi.md#mod_lesson_get_user_grade) | **POST** /mod_lesson_get_user_grade | Return the final grade in the lesson for the given user.
[**mod_lesson_get_user_timers**](ModLessonApi.md#mod_lesson_get_user_timers) | **POST** /mod_lesson_get_user_timers | Return the timers in the current lesson for the given user.
[**mod_lesson_launch_attempt**](ModLessonApi.md#mod_lesson_launch_attempt) | **POST** /mod_lesson_launch_attempt | Starts a new attempt or continues an existing one.
[**mod_lesson_process_page**](ModLessonApi.md#mod_lesson_process_page) | **POST** /mod_lesson_process_page | Processes page responses.
[**mod_lesson_view_lesson**](ModLessonApi.md#mod_lesson_view_lesson) | **POST** /mod_lesson_view_lesson | Trigger the course module viewed event and update the module completion status.



## mod_lesson_finish_attempt

> models::ModLessonFinishAttempt200Response mod_lesson_finish_attempt(mod_lesson_finish_attempt_request)
Finishes the current attempt.

Finishes the current attempt.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lesson_finish_attempt_request** | [**ModLessonFinishAttemptRequest**](ModLessonFinishAttemptRequest.md) |  | [required] |

### Return type

[**models::ModLessonFinishAttempt200Response**](mod_lesson_finish_attempt_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lesson_get_attempts_overview

> models::ModLessonGetAttemptsOverview200Response mod_lesson_get_attempts_overview(mod_lesson_get_attempts_overview_request)
Get a list of all the attempts made by users in a lesson.

Get a list of all the attempts made by users in a lesson.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lesson_get_attempts_overview_request** | [**ModLessonGetAttemptsOverviewRequest**](ModLessonGetAttemptsOverviewRequest.md) |  | [required] |

### Return type

[**models::ModLessonGetAttemptsOverview200Response**](mod_lesson_get_attempts_overview_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lesson_get_content_pages_viewed

> models::ModLessonGetContentPagesViewed200Response mod_lesson_get_content_pages_viewed(mod_lesson_get_content_pages_viewed_request)
Return the list of content pages viewed by a user during a lesson attempt.

Return the list of content pages viewed by a user during a lesson attempt.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lesson_get_content_pages_viewed_request** | [**ModLessonGetContentPagesViewedRequest**](ModLessonGetContentPagesViewedRequest.md) |  | [required] |

### Return type

[**models::ModLessonGetContentPagesViewed200Response**](mod_lesson_get_content_pages_viewed_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lesson_get_lesson

> models::ModLessonGetLesson200Response mod_lesson_get_lesson(mod_lesson_get_lesson_request)
Return information of a given lesson.

Return information of a given lesson.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lesson_get_lesson_request** | [**ModLessonGetLessonRequest**](ModLessonGetLessonRequest.md) |  | [required] |

### Return type

[**models::ModLessonGetLesson200Response**](mod_lesson_get_lesson_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lesson_get_lesson_access_information

> models::ModLessonGetLessonAccessInformation200Response mod_lesson_get_lesson_access_information(mod_lesson_get_lesson_access_information_request)
Return access information for a given lesson.

Return access information for a given lesson.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lesson_get_lesson_access_information_request** | [**ModLessonGetLessonAccessInformationRequest**](ModLessonGetLessonAccessInformationRequest.md) |  | [required] |

### Return type

[**models::ModLessonGetLessonAccessInformation200Response**](mod_lesson_get_lesson_access_information_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lesson_get_lessons_by_courses

> models::ModLessonGetLessonsByCourses200Response mod_lesson_get_lessons_by_courses(mod_chat_get_chats_by_courses_request)
Returns a list of lessons in a provided list of courses,                             if no list is provided all lessons that the user can view will be returned.

Returns a list of lessons in a provided list of courses,                             if no list is provided all lessons that the user can view will be returned.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_chat_get_chats_by_courses_request** | [**ModChatGetChatsByCoursesRequest**](ModChatGetChatsByCoursesRequest.md) |  | [required] |

### Return type

[**models::ModLessonGetLessonsByCourses200Response**](mod_lesson_get_lessons_by_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lesson_get_page_data

> models::ModLessonGetPageData200Response mod_lesson_get_page_data(mod_lesson_get_page_data_request)
Return information of a given page, including its contents.

Return information of a given page, including its contents.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lesson_get_page_data_request** | [**ModLessonGetPageDataRequest**](ModLessonGetPageDataRequest.md) |  | [required] |

### Return type

[**models::ModLessonGetPageData200Response**](mod_lesson_get_page_data_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lesson_get_pages

> models::ModLessonGetPages200Response mod_lesson_get_pages(mod_lesson_get_pages_request)
Return the list of pages in a lesson (based on the user permissions).

Return the list of pages in a lesson (based on the user permissions).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lesson_get_pages_request** | [**ModLessonGetPagesRequest**](ModLessonGetPagesRequest.md) |  | [required] |

### Return type

[**models::ModLessonGetPages200Response**](mod_lesson_get_pages_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lesson_get_pages_possible_jumps

> models::ModLessonGetPagesPossibleJumps200Response mod_lesson_get_pages_possible_jumps(mod_lesson_get_lesson_access_information_request)
Return all the possible jumps for the pages in a given lesson.

Return all the possible jumps for the pages in a given lesson.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lesson_get_lesson_access_information_request** | [**ModLessonGetLessonAccessInformationRequest**](ModLessonGetLessonAccessInformationRequest.md) |  | [required] |

### Return type

[**models::ModLessonGetPagesPossibleJumps200Response**](mod_lesson_get_pages_possible_jumps_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lesson_get_questions_attempts

> models::ModLessonGetQuestionsAttempts200Response mod_lesson_get_questions_attempts(mod_lesson_get_questions_attempts_request)
Return the list of questions attempts in a given lesson.

Return the list of questions attempts in a given lesson.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lesson_get_questions_attempts_request** | [**ModLessonGetQuestionsAttemptsRequest**](ModLessonGetQuestionsAttemptsRequest.md) |  | [required] |

### Return type

[**models::ModLessonGetQuestionsAttempts200Response**](mod_lesson_get_questions_attempts_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lesson_get_user_attempt

> models::ModLessonGetUserAttempt200Response mod_lesson_get_user_attempt(mod_lesson_get_user_attempt_request)
Return information about the given user attempt (including answers).

Return information about the given user attempt (including answers).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lesson_get_user_attempt_request** | [**ModLessonGetUserAttemptRequest**](ModLessonGetUserAttemptRequest.md) |  | [required] |

### Return type

[**models::ModLessonGetUserAttempt200Response**](mod_lesson_get_user_attempt_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lesson_get_user_attempt_grade

> models::ModLessonGetUserAttemptGrade200Response mod_lesson_get_user_attempt_grade(mod_lesson_get_user_attempt_grade_request)
Return grade information in the attempt for a given user.

Return grade information in the attempt for a given user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lesson_get_user_attempt_grade_request** | [**ModLessonGetUserAttemptGradeRequest**](ModLessonGetUserAttemptGradeRequest.md) |  | [required] |

### Return type

[**models::ModLessonGetUserAttemptGrade200Response**](mod_lesson_get_user_attempt_grade_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lesson_get_user_grade

> models::ModLessonGetUserGrade200Response mod_lesson_get_user_grade(mod_lesson_get_user_grade_request)
Return the final grade in the lesson for the given user.

Return the final grade in the lesson for the given user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lesson_get_user_grade_request** | [**ModLessonGetUserGradeRequest**](ModLessonGetUserGradeRequest.md) |  | [required] |

### Return type

[**models::ModLessonGetUserGrade200Response**](mod_lesson_get_user_grade_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lesson_get_user_timers

> models::ModLessonGetUserTimers200Response mod_lesson_get_user_timers(mod_lesson_get_user_grade_request)
Return the timers in the current lesson for the given user.

Return the timers in the current lesson for the given user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lesson_get_user_grade_request** | [**ModLessonGetUserGradeRequest**](ModLessonGetUserGradeRequest.md) |  | [required] |

### Return type

[**models::ModLessonGetUserTimers200Response**](mod_lesson_get_user_timers_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lesson_launch_attempt

> models::ModLessonLaunchAttempt200Response mod_lesson_launch_attempt(mod_lesson_launch_attempt_request)
Starts a new attempt or continues an existing one.

Starts a new attempt or continues an existing one.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lesson_launch_attempt_request** | [**ModLessonLaunchAttemptRequest**](ModLessonLaunchAttemptRequest.md) |  | [required] |

### Return type

[**models::ModLessonLaunchAttempt200Response**](mod_lesson_launch_attempt_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lesson_process_page

> models::ModLessonProcessPage200Response mod_lesson_process_page(mod_lesson_process_page_request)
Processes page responses.

Processes page responses.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lesson_process_page_request** | [**ModLessonProcessPageRequest**](ModLessonProcessPageRequest.md) |  | [required] |

### Return type

[**models::ModLessonProcessPage200Response**](mod_lesson_process_page_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mod_lesson_view_lesson

> models::CoreCalendarDeleteSubscription200Response mod_lesson_view_lesson(mod_lesson_get_lesson_request)
Trigger the course module viewed event and update the module completion status.

Trigger the course module viewed event and update the module completion status.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**mod_lesson_get_lesson_request** | [**ModLessonGetLessonRequest**](ModLessonGetLessonRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

