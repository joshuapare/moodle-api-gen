# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_lesson_get_lessons_by_courses200_response import ModLessonGetLessonsByCourses200Response

class TestModLessonGetLessonsByCourses200Response(unittest.TestCase):
    """ModLessonGetLessonsByCourses200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModLessonGetLessonsByCourses200Response:
        """Test ModLessonGetLessonsByCourses200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModLessonGetLessonsByCourses200Response`
        """
        model = ModLessonGetLessonsByCourses200Response()
        if include_optional:
            return ModLessonGetLessonsByCourses200Response(
                lessons = [
                    openapi_client.models.mod_lesson_get_lessons_by_courses_200_response_lessons_inner.mod_lesson_get_lessons_by_courses_200_response_lessons_inner(
                        activitylink = 56, 
                        allowofflineattempts = True, 
                        available = 56, 
                        bgcolor = '', 
                        completionendreached = 56, 
                        completiontimespent = 56, 
                        conditions = '', 
                        course = 56, 
                        coursemodule = 56, 
                        custom = True, 
                        deadline = 56, 
                        dependency = 56, 
                        displayleft = True, 
                        displayleftif = 56, 
                        feedback = True, 
                        grade = 56, 
                        height = 56, 
                        id = 56, 
                        intro = '', 
                        introfiles = [
                            openapi_client.models.core_blog_get_entries_200_response_entries_inner_summaryfiles_inner.core_blog_get_entries_200_response_entries_inner_summaryfiles_inner(
                                filename = '', 
                                filepath = '', 
                                filesize = 56, 
                                fileurl = '', 
                                isexternalfile = True, 
                                mimetype = '', 
                                repositorytype = '', 
                                timemodified = 56, )
                            ], 
                        introformat = 56, 
                        lang = '', 
                        maxanswers = 56, 
                        maxattempts = 56, 
                        maxpages = 56, 
                        mediaclose = 56, 
                        mediafile = '', 
                        mediafiles = [
                            openapi_client.models.core_blog_get_entries_200_response_entries_inner_summaryfiles_inner.core_blog_get_entries_200_response_entries_inner_summaryfiles_inner(
                                filename = '', 
                                filepath = '', 
                                filesize = 56, 
                                fileurl = '', 
                                isexternalfile = True, 
                                mimetype = '', 
                                repositorytype = '', 
                                timemodified = 56, )
                            ], 
                        mediaheight = 56, 
                        mediawidth = 56, 
                        minquestions = 56, 
                        modattempts = True, 
                        name = '', 
                        nextpagedefault = 56, 
                        ongoing = True, 
                        password = '', 
                        practice = True, 
                        progressbar = True, 
                        retake = True, 
                        review = True, 
                        slideshow = True, 
                        timelimit = 56, 
                        timemodified = 56, 
                        usemaxgrade = 56, 
                        usepassword = True, 
                        width = 56, )
                    ],
                warnings = [
                    openapi_client.models.auth_email_signup_user_200_response_warnings_inner.auth_email_signup_user_200_response_warnings_inner(
                        item = '', 
                        itemid = 56, 
                        message = '', 
                        warningcode = '', )
                    ]
            )
        else:
            return ModLessonGetLessonsByCourses200Response(
                lessons = [
                    openapi_client.models.mod_lesson_get_lessons_by_courses_200_response_lessons_inner.mod_lesson_get_lessons_by_courses_200_response_lessons_inner(
                        activitylink = 56, 
                        allowofflineattempts = True, 
                        available = 56, 
                        bgcolor = '', 
                        completionendreached = 56, 
                        completiontimespent = 56, 
                        conditions = '', 
                        course = 56, 
                        coursemodule = 56, 
                        custom = True, 
                        deadline = 56, 
                        dependency = 56, 
                        displayleft = True, 
                        displayleftif = 56, 
                        feedback = True, 
                        grade = 56, 
                        height = 56, 
                        id = 56, 
                        intro = '', 
                        introfiles = [
                            openapi_client.models.core_blog_get_entries_200_response_entries_inner_summaryfiles_inner.core_blog_get_entries_200_response_entries_inner_summaryfiles_inner(
                                filename = '', 
                                filepath = '', 
                                filesize = 56, 
                                fileurl = '', 
                                isexternalfile = True, 
                                mimetype = '', 
                                repositorytype = '', 
                                timemodified = 56, )
                            ], 
                        introformat = 56, 
                        lang = '', 
                        maxanswers = 56, 
                        maxattempts = 56, 
                        maxpages = 56, 
                        mediaclose = 56, 
                        mediafile = '', 
                        mediafiles = [
                            openapi_client.models.core_blog_get_entries_200_response_entries_inner_summaryfiles_inner.core_blog_get_entries_200_response_entries_inner_summaryfiles_inner(
                                filename = '', 
                                filepath = '', 
                                filesize = 56, 
                                fileurl = '', 
                                isexternalfile = True, 
                                mimetype = '', 
                                repositorytype = '', 
                                timemodified = 56, )
                            ], 
                        mediaheight = 56, 
                        mediawidth = 56, 
                        minquestions = 56, 
                        modattempts = True, 
                        name = '', 
                        nextpagedefault = 56, 
                        ongoing = True, 
                        password = '', 
                        practice = True, 
                        progressbar = True, 
                        retake = True, 
                        review = True, 
                        slideshow = True, 
                        timelimit = 56, 
                        timemodified = 56, 
                        usemaxgrade = 56, 
                        usepassword = True, 
                        width = 56, )
                    ],
        )
        """

    def testModLessonGetLessonsByCourses200Response(self):
        """Test ModLessonGetLessonsByCourses200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
