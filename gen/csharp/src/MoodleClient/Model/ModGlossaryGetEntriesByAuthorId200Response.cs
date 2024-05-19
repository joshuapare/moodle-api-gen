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
    /// ModGlossaryGetEntriesByAuthorId200Response
    /// </summary>
    [DataContract(Name = "mod_glossary_get_entries_by_author_id_200_response")]
    public partial class ModGlossaryGetEntriesByAuthorId200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModGlossaryGetEntriesByAuthorId200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModGlossaryGetEntriesByAuthorId200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModGlossaryGetEntriesByAuthorId200Response" /> class.
        /// </summary>
        /// <param name="count">The total number of records matching the request. (required).</param>
        /// <param name="entries">entries (required).</param>
        /// <param name="ratinginfo">ratinginfo.</param>
        /// <param name="warnings">warnings.</param>
        public ModGlossaryGetEntriesByAuthorId200Response(int count = default(int), List<ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner> entries = default(List<ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner>), ModForumGetDiscussionPosts200ResponseRatinginfo ratinginfo = default(ModForumGetDiscussionPosts200ResponseRatinginfo), List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            this.Count = count;
            // to ensure "entries" is required (not null)
            if (entries == null)
            {
                throw new ArgumentNullException("entries is a required property for ModGlossaryGetEntriesByAuthorId200Response and cannot be null");
            }
            this.Entries = entries;
            this.Ratinginfo = ratinginfo;
            this.Warnings = warnings;
        }

        /// <summary>
        /// The total number of records matching the request.
        /// </summary>
        /// <value>The total number of records matching the request.</value>
        [DataMember(Name = "count", IsRequired = true, EmitDefaultValue = true)]
        public int Count { get; set; }

        /// <summary>
        /// Gets or Sets Entries
        /// </summary>
        [DataMember(Name = "entries", IsRequired = true, EmitDefaultValue = true)]
        public List<ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner> Entries { get; set; }

        /// <summary>
        /// Gets or Sets Ratinginfo
        /// </summary>
        [DataMember(Name = "ratinginfo", EmitDefaultValue = false)]
        public ModForumGetDiscussionPosts200ResponseRatinginfo Ratinginfo { get; set; }

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
            sb.Append("class ModGlossaryGetEntriesByAuthorId200Response {\n");
            sb.Append("  Count: ").Append(Count).Append("\n");
            sb.Append("  Entries: ").Append(Entries).Append("\n");
            sb.Append("  Ratinginfo: ").Append(Ratinginfo).Append("\n");
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