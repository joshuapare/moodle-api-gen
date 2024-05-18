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
    /// CoreTagGetTagCloud200Response
    /// </summary>
    [DataContract(Name = "core_tag_get_tag_cloud_200_response")]
    public partial class CoreTagGetTagCloud200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreTagGetTagCloud200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreTagGetTagCloud200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreTagGetTagCloud200Response" /> class.
        /// </summary>
        /// <param name="tags">tags (required).</param>
        /// <param name="tagscount">Number of tags returned. (required) (default to null).</param>
        /// <param name="totalcount">Total count of tags. (required) (default to null).</param>
        /// <param name="warnings">warnings.</param>
        public CoreTagGetTagCloud200Response(List<CoreTagGetTagCloud200ResponseTagsInner> tags = default(List<CoreTagGetTagCloud200ResponseTagsInner>), int tagscount = null, int totalcount = null, List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            // to ensure "tags" is required (not null)
            if (tags == null)
            {
                throw new ArgumentNullException("tags is a required property for CoreTagGetTagCloud200Response and cannot be null");
            }
            this.Tags = tags;
            this.Tagscount = tagscount;
            this.Totalcount = totalcount;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Gets or Sets Tags
        /// </summary>
        [DataMember(Name = "tags", IsRequired = true, EmitDefaultValue = true)]
        public List<CoreTagGetTagCloud200ResponseTagsInner> Tags { get; set; }

        /// <summary>
        /// Number of tags returned.
        /// </summary>
        /// <value>Number of tags returned.</value>
        [DataMember(Name = "tagscount", IsRequired = true, EmitDefaultValue = true)]
        public int Tagscount { get; set; }

        /// <summary>
        /// Total count of tags.
        /// </summary>
        /// <value>Total count of tags.</value>
        [DataMember(Name = "totalcount", IsRequired = true, EmitDefaultValue = true)]
        public int Totalcount { get; set; }

        /// <summary>
        /// Gets or Sets Warnings
        /// </summary>
        [DataMember(Name = "warnings", EmitDefaultValue = false)]
        public List<AuthEmailSignupUser200ResponseWarningsInner> Warnings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreTagGetTagCloud200Response {\n");
            sb.Append("  Tags: ").Append(Tags).Append("\n");
            sb.Append("  Tagscount: ").Append(Tagscount).Append("\n");
            sb.Append("  Totalcount: ").Append(Totalcount).Append("\n");
            sb.Append("  Warnings: ").Append(Warnings).Append("\n");
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
