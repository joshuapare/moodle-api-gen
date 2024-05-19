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
    /// CoreBlogGetEntries200Response
    /// </summary>
    [DataContract(Name = "core_blog_get_entries_200_response")]
    public partial class CoreBlogGetEntries200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreBlogGetEntries200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreBlogGetEntries200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreBlogGetEntries200Response" /> class.
        /// </summary>
        /// <param name="entries">entries (required).</param>
        /// <param name="totalentries">The total number of entries found. (required) (default to null).</param>
        /// <param name="warnings">warnings.</param>
        public CoreBlogGetEntries200Response(List<CoreBlogGetEntries200ResponseEntriesInner> entries = default(List<CoreBlogGetEntries200ResponseEntriesInner>), int totalentries = null, List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            // to ensure "entries" is required (not null)
            if (entries == null)
            {
                throw new ArgumentNullException("entries is a required property for CoreBlogGetEntries200Response and cannot be null");
            }
            this.Entries = entries;
            this.Totalentries = totalentries;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Gets or Sets Entries
        /// </summary>
        [DataMember(Name = "entries", IsRequired = true, EmitDefaultValue = true)]
        public List<CoreBlogGetEntries200ResponseEntriesInner> Entries { get; set; }

        /// <summary>
        /// The total number of entries found.
        /// </summary>
        /// <value>The total number of entries found.</value>
        [DataMember(Name = "totalentries", IsRequired = true, EmitDefaultValue = true)]
        public int Totalentries { get; set; }

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
            sb.Append("class CoreBlogGetEntries200Response {\n");
            sb.Append("  Entries: ").Append(Entries).Append("\n");
            sb.Append("  Totalentries: ").Append(Totalentries).Append("\n");
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