# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_data_get_entries200_response import ModDataGetEntries200Response

class TestModDataGetEntries200Response(unittest.TestCase):
    """ModDataGetEntries200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModDataGetEntries200Response:
        """Test ModDataGetEntries200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModDataGetEntries200Response`
        """
        model = ModDataGetEntries200Response()
        if include_optional:
            return ModDataGetEntries200Response(
                entries = [
                    openapi_client.models.mod_data_get_entries_200_response_entries_inner.mod_data_get_entries_200_response_entries_inner(
                        approved = True, 
                        canmanageentry = True, 
                        contents = [
                            openapi_client.models.mod_data_get_entries_200_response_entries_inner_contents_inner.mod_data_get_entries_200_response_entries_inner_contents_inner(
                                content = 'null', 
                                content1 = '', 
                                content2 = '', 
                                content3 = '', 
                                content4 = '', 
                                fieldid = 56, 
                                files = [
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
                                id = 56, 
                                recordid = 56, )
                            ], 
                        dataid = 56, 
                        fullname = 'null', 
                        groupid = 56, 
                        id = 56, 
                        tags = [
                            openapi_client.models.mod_data_get_entries_200_response_entries_inner_tags_inner.mod_data_get_entries_200_response_entries_inner_tags_inner(
                                flag = 56, 
                                id = 56, 
                                isstandard = True, 
                                itemid = 56, 
                                name = '', 
                                ordering = 56, 
                                rawname = '', 
                                tagcollid = 56, 
                                taginstancecontextid = 56, 
                                taginstanceid = 56, )
                            ], 
                        timecreated = 56, 
                        timemodified = 56, 
                        userid = 56, )
                    ],
                listviewcontents = 'null',
                totalcount = 56,
                totalfilesize = 56,
                warnings = [
                    openapi_client.models.auth_email_signup_user_200_response_warnings_inner.auth_email_signup_user_200_response_warnings_inner(
                        item = '', 
                        itemid = 56, 
                        message = '', 
                        warningcode = '', )
                    ]
            )
        else:
            return ModDataGetEntries200Response(
                entries = [
                    openapi_client.models.mod_data_get_entries_200_response_entries_inner.mod_data_get_entries_200_response_entries_inner(
                        approved = True, 
                        canmanageentry = True, 
                        contents = [
                            openapi_client.models.mod_data_get_entries_200_response_entries_inner_contents_inner.mod_data_get_entries_200_response_entries_inner_contents_inner(
                                content = 'null', 
                                content1 = '', 
                                content2 = '', 
                                content3 = '', 
                                content4 = '', 
                                fieldid = 56, 
                                files = [
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
                                id = 56, 
                                recordid = 56, )
                            ], 
                        dataid = 56, 
                        fullname = 'null', 
                        groupid = 56, 
                        id = 56, 
                        tags = [
                            openapi_client.models.mod_data_get_entries_200_response_entries_inner_tags_inner.mod_data_get_entries_200_response_entries_inner_tags_inner(
                                flag = 56, 
                                id = 56, 
                                isstandard = True, 
                                itemid = 56, 
                                name = '', 
                                ordering = 56, 
                                rawname = '', 
                                tagcollid = 56, 
                                taginstancecontextid = 56, 
                                taginstanceid = 56, )
                            ], 
                        timecreated = 56, 
                        timemodified = 56, 
                        userid = 56, )
                    ],
                totalcount = 56,
                totalfilesize = 56,
        )
        """

    def testModDataGetEntries200Response(self):
        """Test ModDataGetEntries200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()