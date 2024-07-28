package com.peteraraujo.articapi.services.collections.artwork

import com.peteraraujo.articapi.services.commons.Param

/**
 * Field param options.
 *
 * */
enum class ArtworkFieldParam(override val value: String) : Param {

    /** Unique identifier of this resource. Taken from the source system. */
    Id("id"),

    /** REST API resource type or endpoint */
    ApiModel("api_model"),

    /** REST API link for this resource */
    ApiLink("api_link"),

    /** Whether this document should be boosted in search */
    IsBoosted("is_boosted"),

    /** The name of this resource */
    Title("title"),

    /** Alternate names for this work */
    AltTitles("alt_titles"),

    /** Metadata about the image referenced by image_id. */
    Thumbnail("thumbnail"),

    /** Search score. */
    Score("_score"),

    /** Unique identifier assigned to the artwork upon acquisition */
    MainReferenceNumber("main_reference_number"),

    /** Whether the artwork hasn't been visited on our website very much */
    HasNotBeenViewedMuch("has_not_been_viewed_much"),

    /** Manual indication of what rank this artwork should take in search results. Noncontiguous. */
    BoostRank("boost_rank"),

    /** The year of the period of time associated with the creation of this work */
    DateStart("date_start"),

    /** The year of the period of time associated with the creation of this work */
    DateEnd("date_end"),

    /** Readable, free-text description of the period of time associated with the creation of this work. */
    DateDisplay("date_display"),

    /** Readable, text qualifer to the dates provided for this record. */
    DateQualifierTitle("date_qualifier_title"),

    /** Unique identifier of the qualifer to the dates provided for this record. */
    DateQualifierId("date_qualifier_id"),

    /** Readable description of the creator of this work. Includes artist names, nationality and lifespan dates */
    ArtistDisplay("artist_display"),

    /** The location where the creation, design, or production of the work took place, or the original location of the work */
    PlaceOfOrigin("place_of_origin"),

    /** The size, shape, scale, and dimensions of the work. */
    Dimensions("dimensions"),

    /** The height, width, depth, and/or diameter of each section of the work in centimeters */
    DimensionsDetail("dimensions_detail"),

    /** The substances or materials used in the creation of a work */
    MediumDisplay("medium_display"),

    /** Brief statement indicating how the work came into the collection */
    CreditLine("credit_line"),

    /** Indicator of how much metadata on the work in published. Web Basic is the least amount, Web Everything is the greatest. */
    PublishingVerificationLevel("publishing_verification_level"),

    /** An internal department id we use for analytics. Does not correspond to departments on the website. */
    InternalDepartmentId("internal_department_id"),

    /** The fiscal year in which the work was acquired. */
    FiscalYear("fiscal_year"),

    /** The fiscal year in which the work was deaccessioned. */
    FiscalYearDeaccession("fiscal_year_deaccession"),

    /** Whether the work is in the public domain, meaning it was created before copyrights existed or has left the copyright term */
    IsPublicDomain("is_public_domain"),

    /** Whether images of the work are allowed to be displayed in a zoomable interface. */
    IsZoomable("is_zoomable"),

    /** The maximum size of the window the image is allowed to be viewed in, in pixels. */
    MaxZoomWindowSize("max_zoom_window_size"),

    /** Unbounded positive float representing an abstract measure of colorfulness. */
    Colorfulness("colorfulness"),

    /** Dominant color of this artwork in HSL */
    Color("color"),

    /** The kind of object or work (e.g. Painting, Sculpture, Book) */
    ArtworkTypeTitle("artwork_type_title"),

    /** Unique identifier of the kind of object or work */
    ArtworkTypeId("artwork_type_id"),

    /** Name of the curatorial department that this work belongs to */
    DepartmentTitle("department_title"),

    /** Unique identifier of the curatorial department that this work belongs to */
    DepartmentId("department_id"),

    /** Unique identifier of the preferred artist/culture associated with this work */
    ArtistId("artist_id"),

    /** Name of the preferred artist/culture associated with this work */
    ArtistTitle("artist_title"),

    /** Unique identifiers of the non-preferred artists/cultures associated with this work */
    AltArtistIds("alt_artist_ids"),

    /** Unique identifier of all artist/cultures associated with this work */
    ArtistIds("artist_ids"),

    /** Names of all artist/cultures associated with this work */
    ArtistTitles("artist_titles"),

    /** Unique identifiers of the categories this work is a part of */
    CategoryIds("category_ids"),

    /** Names of the categories this artwork is a part of */
    CategoryTitles("category_titles"),

    /** The names of the taxonomy tags for this work */
    TermTitles("term_titles"),

    /** Unique identifier of the preferred classification term for this work */
    ClassificationId("classification_id"),

    /** The name of the preferred classification term for this work */
    ClassificationTitle("classification_title"),

    /** Unique identifiers of all other non-preferred classification terms for this work */
    AltClassificationIds("alt_classification_ids"),

    /** Unique identifiers of all classification terms for this work */
    ClassificationIds("classification_ids"),

    /** The names of all classification terms related to this artwork */
    ClassificationTitles("classification_titles"),

    /** Unique identifier of the preferred subject term for this work */
    SubjectId("subject_id"),

    /** A free-text description of the work. May include artist statements, curatorial interpretations, and historical context. */
    Description("description"),

    /** A short, introductory description of the work, suitable for display in lists or summaries. */ShortDescription("short_description"),

    /** Text that is physically inscribed on the work, such as signatures, dates, or dedications. */
    Inscriptions("inscriptions"),

    /** A formatted string displaying the work's catalogue information, including title, artist, and date. */
    CatalogueDisplay("catalogue_display"),

    /** Information about the publication history of the work, including books, articles, and exhibition catalogues. */
    PublicationHistory("publication_history"),

    /** A chronological list of exhibitions where the work has been displayed. */
    ExhibitionHistory("exhibition_history"),

    /** Information about the ownership history of the work, tracing its passage through collectors and institutions. */
    ProvenanceText("provenance_text"),

    /** Information about the edition or version of the work, if applicable (e.g., for prints or multiples). */
    Edition("edition"),

    /** A statement indicating the copyright status of the work. */
    CopyrightNotice("copyright_notice"),

    /** Indicates whether the work has associated multimedia resources, such as audio guides or video interviews. */
    HasMultimediaResources("has_multimedia_resources"),

    /** Indicates whether the work has associated educational resources, such as lesson plans or interactive activities. */
    HasEducationalResources("has_educational_resources"),

    /** Indicates whether the work has been captured using advanced imaging techniques, such as high-resolution photography or 3D scanning. */
    HasAdvancedImaging("has_advanced_imaging"),

    /** The geographic latitude of the work's location, if known. */
    Latitude("latitude"),

    /** The geographic longitude of the work's location, if known. */
    Longitude("longitude"),

    /** A combined string representation of the work's latitude and longitude coordinates. */
    Latlon("latlon"),

    /** Indicates whether the work is currently on display at the museum. */
    IsOnView("is_on_view"),

    /** A string indicating the loan status of the work, if applicable (e.g., "On loan to the Louvre"). */
    OnLoanDisplay("on_loan_display"),

    /** The name of the gallery where the work is currently displayed, if applicable. */
    GalleryTitle("gallery_title"),

    /** The Nomisma ID of the work, if applicable (used for numismatic objects). */
    NomismaId("nomisma_id"),

    /** The unique identifier of the gallery where the work is currently displayed, if applicable. */
    GalleryId("gallery_id"),

    /** Unique identifier of the preferred style term for this work */
    StyleId("style_id"),

    /** The name of the preferred style term for this work */
    StyleTitle("style_title"),

    /** Unique identifiers of all other non-preferred style terms for this work */
    AltStyleIds("alt_style_ids"),

    /** Unique identifiers of all style terms for this work */
    StyleIds("style_ids"),

    /** The names of all style terms related to this artwork */
    StyleTitles("style_titles"),

    /** Unique identifier of the preferred technique term for this work */
    TechniqueId("technique_id"),

    /** Unique identifiers of all other non-preferred technique terms for this work */
    AltTechniqueIds("alt_technique_ids"),

    /** Unique identifiers of all technique terms for this work */
    TechniqueIds("technique_ids"),

    /** The names of all technique terms related to this artwork */
    TechniqueTitles("technique_titles"),

    /** The names of all theme terms related to this artwork */
    ThemeTitles("theme_titles"),

    /** Unique identifiers of all other non-preferred subject terms for this work */
    AltSubjectIds("alt_subject_ids"),

    /** Unique identifiers of all subject terms for this work */
    SubjectIds("subject_ids"),

    /** The names of all subject terms related to this artwork */
    SubjectTitles("subject_titles"),

    /** Unique identifier of the preferred material term for this work */
    MaterialId("material_id"),

    /** Unique identifiers of all other non-preferred material terms for this work */
    AltMaterialIds("alt_material_ids"),

    /** Unique identifiers of all material terms for this work */
    MaterialIds("material_ids"),

    /** The names of all material terms related to this artwork */
    MaterialTitles("material_titles"),

    /** Unique identifier of the preferred image to use to represent this work */
    ImageId("image_id"),

    /** Unique identifiers of all non-preferred images of this work */
    AltImageIds("alt_image_ids"),

    /** Unique identifiers of assets that serve as documentation for this artwork */
    DocumentIds("document_ids"),

    /** Unique identifiers of the audio about this work */
    SoundIds("sound_ids"),

    /** Unique identifiers of the videos about this work */
    VideoIds("video_ids"),

    /** Unique identifiers of the texts about this work */
    TextIds("text_ids"),

    /** Unique identifiers of the digital publication chapters this work in included in */
    SectionIds("section_ids"),

    /** Names of the digital publication chapters this work is included in */
    SectionTitles("section_titles"),

    /** Unique identifiers of the microsites this work is a part of */
    SiteIds("site_ids"),

    /** Date and time the resource was updated in the source system */
    SourceUpdatedAt("source_updated_at"),

    /** Date and time the record was updated in the aggregator database */
    UpdatedAt("updated_at"),

    /** Date and time the record was updated in the aggregator search index */
    Timestamp("timestamp"),

    /** Internal field to power the /autocomplete endpoint. Do not use directly. */
    SuggestAutocompleteBoosted("suggest_autocomplete_boosted"),

    /** Internal field to power the /autosuggest endpoint. Do not use directly. */
    SuggestAutocompleteAll("suggest_autocomplete_all"),

    Sites("sites"),
    ArtistPivots("artist_pivots"),
    PlacePivots("place_pivots"),
    Dates("dates")
}