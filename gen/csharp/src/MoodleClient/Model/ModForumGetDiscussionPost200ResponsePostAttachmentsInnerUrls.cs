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
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls
    /// </summary>
    [DataContract(Name = "mod_forum_get_discussion_post_200_response_post_attachments_inner_urls")]
    public partial class ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls" /> class.
        /// </summary>
        /// <param name="export">The URL used to export the attachment.</param>
        public ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls(string export = default(string))
        {
            this.Export = export;
        }

        /// <summary>
        /// The URL used to export the attachment
        /// </summary>
        /// <value>The URL used to export the attachment</value>
        [DataMember(Name = "export", EmitDefaultValue = false)]
        public string Export { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls {\n");
            sb.Append("  Export: ").Append(Export).Append("\n");
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
