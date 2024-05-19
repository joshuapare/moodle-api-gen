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
    /// ModWikiGetPageForEditing200ResponsePagesection
    /// </summary>
    [DataContract(Name = "mod_wiki_get_page_for_editing_200_response_pagesection")]
    public partial class ModWikiGetPageForEditing200ResponsePagesection : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWikiGetPageForEditing200ResponsePagesection" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModWikiGetPageForEditing200ResponsePagesection() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWikiGetPageForEditing200ResponsePagesection" /> class.
        /// </summary>
        /// <param name="content">The contents of the page-section to be edited. (default to &quot;null&quot;).</param>
        /// <param name="contentformat">Format of the original content of the page. (default to &quot;null&quot;).</param>
        /// <param name="varVersion">Latest version of the page. (required).</param>
        /// <param name="warnings">warnings.</param>
        public ModWikiGetPageForEditing200ResponsePagesection(string content = @"null", string contentformat = @"null", int varVersion = default(int), List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            this.VarVersion = varVersion;
            // use default value if no "content" provided
            this.Content = content ?? @"null";
            // use default value if no "contentformat" provided
            this.Contentformat = contentformat ?? @"null";
            this.Warnings = warnings;
        }

        /// <summary>
        /// The contents of the page-section to be edited.
        /// </summary>
        /// <value>The contents of the page-section to be edited.</value>
        [DataMember(Name = "content", EmitDefaultValue = false)]
        public string Content { get; set; }

        /// <summary>
        /// Format of the original content of the page.
        /// </summary>
        /// <value>Format of the original content of the page.</value>
        [DataMember(Name = "contentformat", EmitDefaultValue = false)]
        public string Contentformat { get; set; }

        /// <summary>
        /// Latest version of the page.
        /// </summary>
        /// <value>Latest version of the page.</value>
        [DataMember(Name = "version", IsRequired = true, EmitDefaultValue = true)]
        public int VarVersion { get; set; }

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
            sb.Append("class ModWikiGetPageForEditing200ResponsePagesection {\n");
            sb.Append("  Content: ").Append(Content).Append("\n");
            sb.Append("  Contentformat: ").Append(Contentformat).Append("\n");
            sb.Append("  VarVersion: ").Append(VarVersion).Append("\n");
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
