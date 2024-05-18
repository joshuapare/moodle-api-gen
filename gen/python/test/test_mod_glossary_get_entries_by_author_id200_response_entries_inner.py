# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_glossary_get_entries_by_author_id200_response_entries_inner import ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner

class TestModGlossaryGetEntriesByAuthorId200ResponseEntriesInner(unittest.TestCase):
    """ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner:
        """Test ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner`
        """
        model = ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner()
        if include_optional:
            return ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner(
                approved = True,
                attachment = True,
                attachments = [
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
                casesensitive = True,
                concept = '',
                definition = '',
                definitionformat = 56,
                definitioninlinefiles = [
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
                definitiontrust = True,
                fullmatch = True,
                glossaryid = 56,
                id = 56,
                sourceglossaryid = 56,
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
                teacherentry = True,
                timecreated = 56,
                timemodified = 56,
                usedynalink = True,
                userfullname = '',
                userid = 56,
                userpictureurl = ''
            )
        else:
            return ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner(
        )
        """

    def testModGlossaryGetEntriesByAuthorId200ResponseEntriesInner(self):
        """Test ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()