/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner
    /// </summary>
    [DataContract(Name = "mod_forum_add_discussion_post_200_response_post_author_groups_inner")]
    public partial class ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="name">name.</param>
        /// <param name="urls">urls.</param>
        public ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner(int id = default(int), string name = default(string), ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls urls = default(ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls))
        {
            this.Id = id;
            this.Name = name;
            this.Urls = urls;
        }

        /// <summary>
        /// id
        /// </summary>
        /// <value>id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// name
        /// </summary>
        /// <value>name</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Urls
        /// </summary>
        [DataMember(Name = "urls", EmitDefaultValue = false)]
        public ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls Urls { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Urls: ").Append(Urls).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}