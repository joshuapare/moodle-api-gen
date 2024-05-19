# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_scorm_get_scorms_by_courses200_response import ModScormGetScormsByCourses200Response

class TestModScormGetScormsByCourses200Response(unittest.TestCase):
    """ModScormGetScormsByCourses200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModScormGetScormsByCourses200Response:
        """Test ModScormGetScormsByCourses200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModScormGetScormsByCourses200Response`
        """
        model = ModScormGetScormsByCourses200Response()
        if include_optional:
            return ModScormGetScormsByCourses200Response(
                options = [
                    openapi_client.models.mod_scorm_get_scorms_by_courses_200_response_options_inner.mod_scorm_get_scorms_by_courses_200_response_options_inner(
                        name = 'null', 
                        value = 'null', )
                    ],
                scorms = [
                    openapi_client.models.mod_scorm_get_scorms_by_courses_200_response_scorms_inner.mod_scorm_get_scorms_by_courses_200_response_scorms_inner(
                        auto = True, 
                        autocommit = True, 
                        completionscorerequired = 56, 
                        completionstatusallscos = 56, 
                        completionstatusrequired = 56, 
                        course = 56, 
                        coursemodule = 56, 
                        displayattemptstatus = 56, 
                        displaycoursestructure = True, 
                        forcecompleted = True, 
                        forcenewattempt = 56, 
                        grademethod = 56, 
                        groupingid = 56, 
                        groupmode = 56, 
                        height = 56, 
                        hidebrowse = True, 
                        hidetoc = 56, 
                        id = 56, 
                        intro = '', 
                        introfiles = [
                            openapi_client.models.core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner(
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
                        lastattemptlock = True, 
                        launch = 56, 
                        maxattempt = 56, 
                        maxgrade = 56, 
                        md5hash = 'null', 
                        name = '', 
                        nav = 56, 
                        navpositionleft = 56, 
                        navpositiontop = 56, 
                        options = '', 
                        packagesize = 56, 
                        packageurl = 'null', 
                        popup = 56, 
                        protectpackagedownloads = True, 
                        reference = 'null', 
                        revision = 56, 
                        scormtype = 'null', 
                        section = 56, 
                        sha1hash = 'null', 
                        skipview = 56, 
                        timeclose = 56, 
                        timemodified = 56, 
                        timeopen = 56, 
                        updatefreq = 56, 
                        version = 'null', 
                        visible = True, 
                        whatgrade = 56, 
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
            return ModScormGetScormsByCourses200Response(
                scorms = [
                    openapi_client.models.mod_scorm_get_scorms_by_courses_200_response_scorms_inner.mod_scorm_get_scorms_by_courses_200_response_scorms_inner(
                        auto = True, 
                        autocommit = True, 
                        completionscorerequired = 56, 
                        completionstatusallscos = 56, 
                        completionstatusrequired = 56, 
                        course = 56, 
                        coursemodule = 56, 
                        displayattemptstatus = 56, 
                        displaycoursestructure = True, 
                        forcecompleted = True, 
                        forcenewattempt = 56, 
                        grademethod = 56, 
                        groupingid = 56, 
                        groupmode = 56, 
                        height = 56, 
                        hidebrowse = True, 
                        hidetoc = 56, 
                        id = 56, 
                        intro = '', 
                        introfiles = [
                            openapi_client.models.core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner(
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
                        lastattemptlock = True, 
                        launch = 56, 
                        maxattempt = 56, 
                        maxgrade = 56, 
                        md5hash = 'null', 
                        name = '', 
                        nav = 56, 
                        navpositionleft = 56, 
                        navpositiontop = 56, 
                        options = '', 
                        packagesize = 56, 
                        packageurl = 'null', 
                        popup = 56, 
                        protectpackagedownloads = True, 
                        reference = 'null', 
                        revision = 56, 
                        scormtype = 'null', 
                        section = 56, 
                        sha1hash = 'null', 
                        skipview = 56, 
                        timeclose = 56, 
                        timemodified = 56, 
                        timeopen = 56, 
                        updatefreq = 56, 
                        version = 'null', 
                        visible = True, 
                        whatgrade = 56, 
                        width = 56, )
                    ],
        )
        """

    def testModScormGetScormsByCourses200Response(self):
        """Test ModScormGetScormsByCourses200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
