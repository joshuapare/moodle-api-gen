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
    /// ModWorkshopAddSubmissionRequest
    /// </summary>
    [DataContract(Name = "mod_workshop_add_submission_request")]
    public partial class ModWorkshopAddSubmissionRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWorkshopAddSubmissionRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModWorkshopAddSubmissionRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWorkshopAddSubmissionRequest" /> class.
        /// </summary>
        /// <param name="attachmentsid">The draft file area id for attachments (default to 0).</param>
        /// <param name="content">Submission text content (default to &quot;&quot;).</param>
        /// <param name="contentformat">The format used for the content (default to 0).</param>
        /// <param name="inlineattachmentsid">The draft file area id for inline attachments in the content (default to 0).</param>
        /// <param name="title">Submission title (required) (default to &quot;null&quot;).</param>
        /// <param name="workshopid">Workshop id (required) (default to null).</param>
        public ModWorkshopAddSubmissionRequest(int attachmentsid = 0, string content = @"", int contentformat = 0, int inlineattachmentsid = 0, string title = @"null", int workshopid = null)
        {
            // to ensure "title" is required (not null)
            if (title == null)
            {
                throw new ArgumentNullException("title is a required property for ModWorkshopAddSubmissionRequest and cannot be null");
            }
            this.Title = title;
            this.Workshopid = workshopid;
            this.Attachmentsid = attachmentsid;
            // use default value if no "content" provided
            this.Content = content ?? @"";
            this.Contentformat = contentformat;
            this.Inlineattachmentsid = inlineattachmentsid;
        }

        /// <summary>
        /// The draft file area id for attachments
        /// </summary>
        /// <value>The draft file area id for attachments</value>
        [DataMember(Name = "attachmentsid", EmitDefaultValue = false)]
        public int Attachmentsid { get; set; }

        /// <summary>
        /// Submission text content
        /// </summary>
        /// <value>Submission text content</value>
        [DataMember(Name = "content", EmitDefaultValue = false)]
        public string Content { get; set; }

        /// <summary>
        /// The format used for the content
        /// </summary>
        /// <value>The format used for the content</value>
        [DataMember(Name = "contentformat", EmitDefaultValue = false)]
        public int Contentformat { get; set; }

        /// <summary>
        /// The draft file area id for inline attachments in the content
        /// </summary>
        /// <value>The draft file area id for inline attachments in the content</value>
        [DataMember(Name = "inlineattachmentsid", EmitDefaultValue = false)]
        public int Inlineattachmentsid { get; set; }

        /// <summary>
        /// Submission title
        /// </summary>
        /// <value>Submission title</value>
        [DataMember(Name = "title", IsRequired = true, EmitDefaultValue = true)]
        public string Title { get; set; }

        /// <summary>
        /// Workshop id
        /// </summary>
        /// <value>Workshop id</value>
        [DataMember(Name = "workshopid", IsRequired = true, EmitDefaultValue = true)]
        public int Workshopid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModWorkshopAddSubmissionRequest {\n");
            sb.Append("  Attachmentsid: ").Append(Attachmentsid).Append("\n");
            sb.Append("  Content: ").Append(Content).Append("\n");
            sb.Append("  Contentformat: ").Append(Contentformat).Append("\n");
            sb.Append("  Inlineattachmentsid: ").Append(Inlineattachmentsid).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Workshopid: ").Append(Workshopid).Append("\n");
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
