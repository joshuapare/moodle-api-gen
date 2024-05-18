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
    /// ModGlossaryPrepareEntryForEdition200Response
    /// </summary>
    [DataContract(Name = "mod_glossary_prepare_entry_for_edition_200_response")]
    public partial class ModGlossaryPrepareEntryForEdition200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModGlossaryPrepareEntryForEdition200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModGlossaryPrepareEntryForEdition200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModGlossaryPrepareEntryForEdition200Response" /> class.
        /// </summary>
        /// <param name="aliases">aliases (required).</param>
        /// <param name="areas">areas (required).</param>
        /// <param name="attachmentsid">Draft item id for the file manager. (required) (default to null).</param>
        /// <param name="categories">categories (required).</param>
        /// <param name="inlineattachmentsid">Draft item id for the text editor. (required) (default to null).</param>
        /// <param name="warnings">warnings.</param>
        public ModGlossaryPrepareEntryForEdition200Response(List<Object> aliases = default(List<Object>), List<ModGlossaryPrepareEntryForEdition200ResponseAreasInner> areas = default(List<ModGlossaryPrepareEntryForEdition200ResponseAreasInner>), int attachmentsid = null, List<Object> categories = default(List<Object>), int inlineattachmentsid = null, List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            // to ensure "aliases" is required (not null)
            if (aliases == null)
            {
                throw new ArgumentNullException("aliases is a required property for ModGlossaryPrepareEntryForEdition200Response and cannot be null");
            }
            this.Aliases = aliases;
            // to ensure "areas" is required (not null)
            if (areas == null)
            {
                throw new ArgumentNullException("areas is a required property for ModGlossaryPrepareEntryForEdition200Response and cannot be null");
            }
            this.Areas = areas;
            this.Attachmentsid = attachmentsid;
            // to ensure "categories" is required (not null)
            if (categories == null)
            {
                throw new ArgumentNullException("categories is a required property for ModGlossaryPrepareEntryForEdition200Response and cannot be null");
            }
            this.Categories = categories;
            this.Inlineattachmentsid = inlineattachmentsid;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Gets or Sets Aliases
        /// </summary>
        [DataMember(Name = "aliases", IsRequired = true, EmitDefaultValue = true)]
        public List<Object> Aliases { get; set; }

        /// <summary>
        /// Gets or Sets Areas
        /// </summary>
        [DataMember(Name = "areas", IsRequired = true, EmitDefaultValue = true)]
        public List<ModGlossaryPrepareEntryForEdition200ResponseAreasInner> Areas { get; set; }

        /// <summary>
        /// Draft item id for the file manager.
        /// </summary>
        /// <value>Draft item id for the file manager.</value>
        [DataMember(Name = "attachmentsid", IsRequired = true, EmitDefaultValue = true)]
        public int Attachmentsid { get; set; }

        /// <summary>
        /// Gets or Sets Categories
        /// </summary>
        [DataMember(Name = "categories", IsRequired = true, EmitDefaultValue = true)]
        public List<Object> Categories { get; set; }

        /// <summary>
        /// Draft item id for the text editor.
        /// </summary>
        /// <value>Draft item id for the text editor.</value>
        [DataMember(Name = "inlineattachmentsid", IsRequired = true, EmitDefaultValue = true)]
        public int Inlineattachmentsid { get; set; }

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
            sb.Append("class ModGlossaryPrepareEntryForEdition200Response {\n");
            sb.Append("  Aliases: ").Append(Aliases).Append("\n");
            sb.Append("  Areas: ").Append(Areas).Append("\n");
            sb.Append("  Attachmentsid: ").Append(Attachmentsid).Append("\n");
            sb.Append("  Categories: ").Append(Categories).Append("\n");
            sb.Append("  Inlineattachmentsid: ").Append(Inlineattachmentsid).Append("\n");
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
