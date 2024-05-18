# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_h5pactivity_get_h5pactivities_by_courses200_response import ModH5pactivityGetH5pactivitiesByCourses200Response

class TestModH5pactivityGetH5pactivitiesByCourses200Response(unittest.TestCase):
    """ModH5pactivityGetH5pactivitiesByCourses200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModH5pactivityGetH5pactivitiesByCourses200Response:
        """Test ModH5pactivityGetH5pactivitiesByCourses200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModH5pactivityGetH5pactivitiesByCourses200Response`
        """
        model = ModH5pactivityGetH5pactivitiesByCourses200Response()
        if include_optional:
            return ModH5pactivityGetH5pactivitiesByCourses200Response(
                h5pactivities = [
                    openapi_client.models.mod_h5pactivity_get_h5pactivities_by_courses_200_response_h5pactivities_inner.mod_h5pactivity_get_h5pactivities_by_courses_200_response_h5pactivities_inner(
                        contenthash = 'null', 
                        context = 56, 
                        course = 56, 
                        coursemodule = 56, 
                        deployedfile = openapi_client.models.mod_h5pactivity_get_h5pactivities_by_courses_200_response_h5pactivities_inner_deployedfile.mod_h5pactivity_get_h5pactivities_by_courses_200_response_h5pactivities_inner_deployedfile(
                            filename = '', 
                            filepath = '', 
                            filesize = 56, 
                            fileurl = '', 
                            mimetype = '', 
                            timemodified = 56, ), 
                        displayoptions = 56, 
                        enabletracking = 56, 
                        grade = 56, 
                        grademethod = 56, 
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
                        name = 'null', 
                        package = [
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
                        timecreated = 56, 
                        timemodified = 56, )
                    ],
                h5pglobalsettings = openapi_client.models.mod_h5pactivity_get_h5pactivities_by_courses_200_response_h5pglobalsettings.mod_h5pactivity_get_h5pactivities_by_courses_200_response_h5pglobalsettings(
                    enablesavestate = True, 
                    savestatefreq = 56, ),
                warnings = [
                    openapi_client.models.auth_email_signup_user_200_response_warnings_inner.auth_email_signup_user_200_response_warnings_inner(
                        item = '', 
                        itemid = 56, 
                        message = '', 
                        warningcode = '', )
                    ]
            )
        else:
            return ModH5pactivityGetH5pactivitiesByCourses200Response(
                h5pactivities = [
                    openapi_client.models.mod_h5pactivity_get_h5pactivities_by_courses_200_response_h5pactivities_inner.mod_h5pactivity_get_h5pactivities_by_courses_200_response_h5pactivities_inner(
                        contenthash = 'null', 
                        context = 56, 
                        course = 56, 
                        coursemodule = 56, 
                        deployedfile = openapi_client.models.mod_h5pactivity_get_h5pactivities_by_courses_200_response_h5pactivities_inner_deployedfile.mod_h5pactivity_get_h5pactivities_by_courses_200_response_h5pactivities_inner_deployedfile(
                            filename = '', 
                            filepath = '', 
                            filesize = 56, 
                            fileurl = '', 
                            mimetype = '', 
                            timemodified = 56, ), 
                        displayoptions = 56, 
                        enabletracking = 56, 
                        grade = 56, 
                        grademethod = 56, 
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
                        name = 'null', 
                        package = [
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
                        timecreated = 56, 
                        timemodified = 56, )
                    ],
        )
        """

    def testModH5pactivityGetH5pactivitiesByCourses200Response(self):
        """Test ModH5pactivityGetH5pactivitiesByCourses200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()